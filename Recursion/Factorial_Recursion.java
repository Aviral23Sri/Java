package Recursion;
import java.util.*;
public class Factorial_Recursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial_Recursion(n));
    }

    public static int Factorial_Recursion(int n){
        if(n==0){
            return 1;

        }
        int fact = n * Factorial_Recursion(n-1);
        return fact;
    }
}
