import java.util.*;
public class pq9_q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number =>");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println("Number =>"+ num + " is Positive ");
        } else{
            System.out.println("Number =>"+ num + " is Negative ");
        }
        sc.close();
    }
}