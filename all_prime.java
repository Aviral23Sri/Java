import java.util.*;
public class all_prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range from 0 to =>");
        int num = sc.nextInt();
        sc.close();
        prime(num);
        
    }
    public static void prime(int num){
        // corner cases
        // System.out.println("vfgfge");
        int n,j; 
        if(num==2)
        {
            System.out.println("The Prime Numbers are => 2");
        }
        for(int i=2;i<=num;i++)
        {
            n =i;
            for( j=2;j<n;j++)
            {
                if(n%j==0)
                {
                    break;
                }
                // System.out.println("j value"+j);
            }
            // System.out.println("vegve");
            if(j==n)
            {
                System.out.println(j);
            }
        }
    }
}
