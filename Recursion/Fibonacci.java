package Recursion;
import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
    }

    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

        int fin_n1 = Fibonacci(n-1);
        int fin_n2 = Fibonacci(n-2);
        int fibonacci = fin_n1 + fin_n2;
        return fibonacci;
    }
}
