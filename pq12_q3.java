import java.util.*;
public class pq12_q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number =>");
        int num = sc.nextInt();
        boolean ans = palindrome(num);
        if(ans==true){
            System.out.println("The Number is Palidrome ");
        }
        else{
        System.out.println("The Number is Not Palidrome ");
        }
    }
    public static boolean palindrome(int num){
        int n = num;
        int rev=0;
        int last_dig =0;
        while(num>0)
        {
            last_dig = num%10;
            rev = (rev*10) + last_dig;
            num = num/10;
        }
        // System.out.println(rev);
        if(n == rev){
            return true;
            
        }
        else{
            return false;
        }
    }
}