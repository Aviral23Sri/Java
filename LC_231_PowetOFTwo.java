// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.

import java.util.*;
public class LC_231_PowetOFTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The value of N =>");
        int n = sc.nextInt();
        boolean x = power(n);
        System.out.println(x);

    }
    public static boolean power(int n){
        int pow=0;
        for(int i=0;pow<=n;i++)
        {
            pow = (int)Math.pow(2, i);
            if(pow==n)
            {
                return true;
            }
        }
        return false;
    }
}
