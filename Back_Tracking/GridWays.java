package Back_Tracking;

public class GridWays {
    public static void main(String args[]){
        int n =3;
        int m =3;
        System.out.println(GridWays(n, m, 0, 0));
    }

    public static int GridWays(int n,int m ,int i,int j){
        // Base Case 
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n||j==m){
            return 0;
        }

        int ways1 = GridWays(n, m, i+1, j);
        int ways2 = GridWays(n, m, i, j+1);
        return ways1+ways2;

        
    }
    
}
