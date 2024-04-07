package Recursion;

public class exponent {
    public static void main(String args[]){
        int x = 2;
        int n = 10;
        System.out.println(exponent(x, n));

    }

    public static int exponent(int x , int n){
        if(n==1){
        return x;
        }

        int exponent = x * exponent(x, n-1);
        return exponent;

    }
    
}
