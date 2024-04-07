import java.util.*;
public class fun_primeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number To Cheak =>");
        int num = sc.nextInt();
        sc.close();
        boolean ans = prime(num);
        if(ans==false)
        {
            System.out.println("NOT PRIME");
        }
        else
        {
            System.out.println("PRIME");
        }

    }
    public static boolean prime(int num){
        //corner cases 
        if(num==2)
        {
            return true;
        }
        for(int i=2 ; 2<num;i++)
        {
            if(num%i==0)
            {
                return false;
                // break;

            }
        }
        return true;    }
}