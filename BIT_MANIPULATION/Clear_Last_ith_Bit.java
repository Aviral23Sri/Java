package BIT_MANIPULATION;
import java.util.*;
public class Clear_Last_ith_Bit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(Clear_Last_ith_Bit(i, n));
    }
    public static int Clear_Last_ith_Bit(int i , int n){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
}
