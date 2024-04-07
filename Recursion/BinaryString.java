package Recursion;
import java.util.*;

import javax.swing.text.Position.Bias;
public class BinaryString {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbern=>");
        int n = sc.nextInt();
        BinaryString(n,"", 0);
   }

   public static void BinaryString(int n, String str,int lastplace){
        if(n==0){
            System.out.println(str);
            return ;

        }
        // kaam 
        if(lastplace==0){
            BinaryString(n-1,str+"0",0);
            BinaryString(n-1, str+"1",1);
        }else{
            BinaryString(n-1,str+"0",0);
        }
   }
}
