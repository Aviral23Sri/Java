package BIT_MANIPULATION;
import java.util.*;
public class Set_ith_Bit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number =>");
        int n = sc.nextInt();
        int x = Set_ith_bit(n);
        System.out.println(x);
    }
    public static int Set_ith_bit(int n){
        System.out.print("Enter the position to Set The Bit =>");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        return ((1<<i) | n);

    }
}
