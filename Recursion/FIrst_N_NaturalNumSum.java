package Recursion;
import java.util.*;
public class FIrst_N_NaturalNumSum {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FIrst_N_NaturalNumSum(n));
    }

    public static int FIrst_N_NaturalNumSum(int n){
        if(n==0){
            return 0;
        }
        int sum = n + FIrst_N_NaturalNumSum(n-1);
        return sum;
    }
}
