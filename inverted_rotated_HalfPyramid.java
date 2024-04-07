import java.util.*;
public class inverted_rotated_HalfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows =>");
        int total_row = sc.nextInt();
        System.out.print("Enter the Number of Columns =>");
        int total_col = sc.nextInt();

        for(int i=1 ; i<=total_row ;i++)
        {
            // Spaces
            for(int j =1; j<=total_row-i ;j++)
                {
                    System.out.print(" ");
                }
                for( int k=1 ; k<=i ;k++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
