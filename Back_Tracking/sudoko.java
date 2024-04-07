package Back_Tracking;

public class sudoko {
    public static void main(String args[]){
        int sudoko[][]= {{0,0,10,0,0,0,0,0},
                         {4,9,0,1,5,7,0,0,2},
                         {0,0,3,0,0,4,1,9,0},
                         {1,8,5,0,6,0,0,2,0},
                         {0,0,0,0,2,0,0,6,0},
                         {9,6,0,4,0,5,3,0,0},
                         {0,3,0,0,7,2,0,0,4},
                         {0,4,9,0,3,0,0,5,7},
                         {8,2,7,0,0,9,0,1,3}};  
                         
        if(SudokoSolver(sudoko, 0, 0)){
            System.out.println("Solution exist");
            printSudoko(sudoko);
        }
        else{
            System.out.println("Solution Dont exist");
        }                 
    }
    public static void printSudoko(int sudoko[][]){
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(sudoko[i][j]+ " ");

            }
            System.err.println();
        }
    }

    public static boolean SudokoSolver(int sudoko[][],int row , int col){
        // Base Case
        if(row==9&& col==0)
        {
            return true;
        }

        //Recursion

        int nextrow = row;
        int nextcol = col+1;
        if(col+1==9)
        {
            nextrow = row+1;
            nextcol = 0;
        }
        if(sudoko[row][col]!=0)
        {
            return SudokoSolver(sudoko, nextrow, nextcol);
        }

        for(int digit=0;digit<=9;digit++)
        {
            if(isSafe(sudoko,row,col,digit))
            {
                sudoko[row][col]=digit;
                if(SudokoSolver(sudoko, nextrow, nextcol))
                {
                    return true;
                }
                sudoko[row][col]= 0;

            }
            
        }
        return false;
    }
    public static boolean isSafe(int sudoko[][],int row,int col,int digit){
        //     column
        for(int i=0;i<8;i++)
        {
            if(sudoko[i][col]==digit){
                return false;
                
            }
        }
        //    row
        for(int j=0;j<8;j++)
        {
            if(sudoko[row][j]==digit){
                return false;
            }
        }
        // Grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i= sr;i<sr+3;i++)
        {
            for(int j=sc ; j<sc ; j++)
            {
                if(sudoko[i][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
}
