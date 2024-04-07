import java.util.*;
public class pq12_q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int x = average(num1, num2, num3);
        System.out.println(x);
    }
    public static int average(int num1 , int num2 , int num3){
        return (num1+num2+num3)/3;
        
    }
}
