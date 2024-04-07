import java.util.*;
public class product_fun {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = mul(a,b);
        System.out.println(x);
        sc.close();
    }
    public static int mul(int a, int b){
        int mul = a*b;
        return mul;
    }
}
