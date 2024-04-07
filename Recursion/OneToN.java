package Recursion;
import java.util.*;
public class OneToN {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =1;
        OneToN(n, a);

    }

    public static void OneToN(int n, int a){
        
        if(a>n){
            return;
        }
        System.out.print(a+" ");
        OneToN(n,a+1);
    }
    
}
