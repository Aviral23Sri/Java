// OPTIMIZED CODE FOR CHEACKING PRIME NUMBER


import java.util.*;
public class optimized_prime {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number =>");
        int num = sc.nextInt();
        boolean ans = isprime(num);
        if(ans == true)
        {
            System.out.println("PRIME");
        }
        System.out.println("NOT PRIME");
        
        
    }
    public static boolean isprime(int num){
        //corner cases
        if(num==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
           if(num%i==0)
            {
                return false;
            }
        }
        return true;       
        
    }
}