
import java.util.*;
public class avi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str="";
        coin(n, str);
    }
    public static void coin(int n,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        coin(n-1, str+'H');
        coin(n-1, str+'T');
    }
    
}
