import java.util.*;
public class hollow_rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Total Number Of Rows =>");
        int total_rows = sc.nextInt();
        System.out.println("Enter The Total Number Of Rows =>");
        int total_col = sc.nextInt();
        hollow_rectangle(total_rows, total_col);
    }
    public static void hollow_rectangle(int total_row , int total_col){
        for(int i=1;i<=total_row;i++)
        {
            for(int j=1;j<=total_col;j++)
            {
                if(i==total_row || i==1 || j==1||j==total_col)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
