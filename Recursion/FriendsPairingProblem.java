package Recursion;
import java.util.*;
public class FriendsPairingProblem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nuumber =>");
        int n = sc.nextInt();
        System.out.println(FriendsPairingProblem(n));
    }
    public static int FriendsPairingProblem(int n){
        // Base Case
        if(n==1 || n==2){
            return n;
        }
        else if(n==0)
        {
            return 1;
        }
        // Single 
        int single =FriendsPairingProblem(n-1);
        // Double
        int doub = n-1 *FriendsPairingProblem(n-2);
        return single + doub;
    }
    
}
