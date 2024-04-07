package BIT_MANIPULATION;
import java.util.*;
public class Get_ith_bit {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number =>");
        int n = sc.nextInt();
        int x = Get_ith_bit(n);
        System.out.println("i th Bit is => "+x);
    }
    public static int Get_ith_bit(int n){
        System.out.print("Enter the pos to find Bit =>");
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        int bit_Mask = 1<<i;
        if((n&bit_Mask)==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }

    
}
