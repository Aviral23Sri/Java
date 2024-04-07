import java.util.*;
public class sum_of_n_naturalNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number => ");
        int n = sc.nextInt();
        int count=1;
        int sum=0;

        while(count<=n)
        {
            sum = sum + count;
            count++;
        }
        System.out.println("The Sum of n Natural Numbers is => " + sum);
        sc.close();
    }
    
}
