import java.util.*;
public class functions_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = add(a,b);
        System.out.println(c);
        sc.close();
    }
    public static int add(int a , int b){
        int sum;
        sum = a+b;
        return sum;
    }

}
