package Array2;
import java.util.*;

public class creation2 {
    public static void main(String args[]){
        int arr[][] = new int[4][3];
        Scanner sc = new Scanner(System.in);
        // Taking Input in 2-D Array
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing 2-D Array
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        int key =10;
        boolean x = searching(arr, 0);
        System.out.println(x);
    }

    public static boolean searching(int arr[][],int key){
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(key== arr[i][j])
                {
                    System.out.println("The Elemnt is found at index => " + i + "," + j); 
                    return true;
                }
            }
        }
        return false;
        
    }
    
}
