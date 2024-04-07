package BIT_MANIPULATION;
import java.util.*;
public class OddOrEven {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number =>");
        int n = sc.nextInt();
        boolean x = OddOrEven(n);
        if(x==true){
            System.out.println("Even");
        }
        else{

            System.out.println("Odd");
        }
    }
    public static boolean OddOrEven(int n){
        int bit_Mask = 1;
        if((n & bit_Mask)==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
}
