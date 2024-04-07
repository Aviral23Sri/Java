package BIT_MANIPULATION;
import java.util.*;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean x = PowerOf2(n);
        System.out.println(x);
    }
    public static boolean PowerOf2(int n){
        int x = n & (n-1);
        if(x==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
}
