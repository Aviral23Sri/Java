package BIT_MANIPULATION;
import java.util.*;
public class update_ith_Bit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number =>");
        int n = sc.nextInt();
        System.out.print("Enter the position =>");
        int i = sc.nextInt();
        System.out.print("Select The Operation :- \n1. Set Bit\n2. Clear Bit\n=>");
        int a = sc.nextInt();
        int x=0;
        if(a==1){
             x = Set_ith_bit(n, i);
        }
        else if(a==2)
        {
             x = Clear_ith_Bit(n, i);
        }

        System.out.println(x);
    }
    public static int Set_ith_bit(int n,int i){
        System.out.print("Enter the position to Set The Bit =>");
        Scanner sc = new Scanner(System.in);
        return ((1<<i) | n);

    }
    public static int Clear_ith_Bit(int n , int i){
        return ((~(1<<i)&n));
    }
}
