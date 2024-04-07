package Array2;
import java.util.*;

public class digonal_sum {
    public static void main(String args[]){
        int arr[][] = new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of 2-D Array =>");
        int m = sc.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int x = digonal_sum(arr, m);
        System.out.println("The SUm of Digonal is =>" + x);


    }
    public static int digonal_sum(int arr[][],int m){
        int sum1=0;
        int sum2=0;
        int sum =0;
        // int count =0;
        if(m%2==0)
        {
            
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(i==j || i+j ==m-1)
                    {
                        sum += arr[i][j];
                    }
                }
            }
        }
        else{
            // for(int i=0;i<m;i++)
            // {
            //     for(int j=0;j<m;j++)
            //     {
            //         if((m-1)/2== i && (m-1)/2== j)
            //         {                                       Brute Force Approch With Complexity of O(N^2)
            //             sum = arr[i][j];
                        
            //         }
            //         else if(i==j || i+j==m-1)
            //         {
            //             sum += arr[i][j];
            //         }
                    
            //     }
            // }

            for(int i=0;i<m;i++)
            {
                sum += arr[i][i];                            // o(N) - time Complextity
                if(i!=(m-1)/2){
                sum += arr[i][m-1-i];
                }
            }
        }
        // int sum = sum1 + sum2;
        return sum;
    }
    
}
