package Array2;
import java.util.*;

public class StairCase_Search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[10][10];
        System.out.print("Enter The Number Of Rows =>");
        int m = sc.nextInt();
        System.out.print("Enter The Number Of Column's =>");
        int n = sc.nextInt();

        System.out.println("Enter the Elements in Matrix :- ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter The Key You Want To Search =>");
        int key = sc.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j] + " ");            //-> Printing The Matrix
            }
            System.out.println();
        }
        StairCase_Search(arr, m, n, key);
        sc.close();
    }
    public static boolean StairCase_Search(int arr[][],int m,int n,int key){
        int row = 0,col=n-1;
        while(row<m && col>=0)
        {
            if(arr[row][col]==key)
            {
                System.out.println("Element Found at (" + row +"," + col + ")");
                return true;
            }
            if(arr[row][col]<key)
            {
                row++;
            }
            else{
                col--;
            }
           
        }
        System.out.println("Key Not Found");
        return false;

    }
    
}
