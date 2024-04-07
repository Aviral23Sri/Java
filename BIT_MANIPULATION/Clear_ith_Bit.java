package BIT_MANIPULATION;
import java.util.*;
public class Clear_ith_Bit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number =>");
        int n = sc.nextInt();
        System.out.print("Enter the position to clear the Bit =>");
        int i = sc.nextInt();
        int x =Clear_ith_Bit(n, i);
        System.out.println(x);
        
    }
    public static int Clear_ith_Bit(int n , int i){
        return ((~(1<<i)&n));
    }
}
