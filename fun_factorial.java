import java.util.*;
public class fun_factorial {
    public static void main(String args[]){
        System.out.print("Enter the  number to find Fctorial =>");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = fact(n);
        System.out.println(x);
        sc.close();
    }
    public static int fact(int n){
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    
}
