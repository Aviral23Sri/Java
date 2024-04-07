package Recursion;
import java.util.*;
public class nTo1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nTo1(n);
    }

    public static void nTo1(int n){
        System.out.println(n);
        if(n>1){
            nTo1(n-1);
        }
    }
    
}
