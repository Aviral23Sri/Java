import java.util.*;
public class pq12_q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number =>");
        int num = sc.nextInt();
        boolean ans = isevem(num);
        System.out.println(ans);
    }
    public static boolean isevem(int num){
        if(num%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
