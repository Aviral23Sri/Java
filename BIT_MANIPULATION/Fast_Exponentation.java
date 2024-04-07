package BIT_MANIPULATION;
import java.util.*;
public class Fast_Exponentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Fast_Exponentation(a, n));
    }
    public static int Fast_Exponentation(int a , int n){
        int ans = 1;
        while(n>0)
        {
            if((n & 1)!=0)
            {
                ans *= a;
            }
            a *= a;
            n = n>>1;
        }
        return ans;
    }
}
