package Back_Tracking;
import java.util.*;
public class nQueen1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = 3;
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='-';
            }

        }
        nQueen1(board, 0,n);
        // PrintBoard(board);
    }
    public static void nQueen1(char board[][],int row,int n){
        if(row==board.length){
            PrintBoard(board);
            System.out.println("------------------------------");
            return;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(board, row, j)){
                board[row][j]='Q';
            nQueen1(board, row+1,n);
            board[row][j]='-';
            }
        }
    }
    public static boolean isSafe(char board[][], int row,int j){
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //upper left
        for(int i=row-1,col=j-1;i>=0&&col>=0;i--,col--)
        {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //upper right
        for(int i=row-1,col=j+1;i>=0&&col<board.length;col++,i--)
        {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }


    public static void PrintBoard(char board[][]){
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
}