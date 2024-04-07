package Array2;

public class Spiral_matrix {
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Spiral_matrix(arr);
    }
    public static void Spiral_matrix(int arr[][])
    {
        int start_row =0;
        int start_col =0;
        int end_row= arr.length-1;
        int end_col = arr[0].length-1;

        while(start_row<=end_row && start_col<=end_col){
        // Top
        for(int i=start_row;i<end_row;i++)
        {
            System.out.print(arr[start_row][i]);
        }
        System.out.println();
        // Right 
        for(int i=start_col;i<end_col;i++)
        {
            System.out.print(arr[i][end_col]);
        }
        System.out.println();
        // Bottom 
        for(int i=end_row;i>start_row;i--)
        {
            System.out.print(arr[end_row][i]);
        }
        System.out.println();
        // Left 
        for(int i=end_col;i>start_col;i--)
        {
            System.out.print(arr[i][start_col]);
        }

        start_row++;
        start_col++;
        end_col--;
        end_row--;
    }

    }
    
}
