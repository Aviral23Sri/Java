package Recursion;
import java.util.*;
public class Tiling_Problem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number =>");
        int n = sc.nextInt();
        System.out.println(Tiling_Problem(n));
    }

    public static int Tiling_Problem(int n){
        // Base Case
        if(n==0|| n==1){
            return 1;
        }

        // vertical Choice 
        int fnm1 = Tiling_Problem(n-1);

        // Horizontal Choice 
        int fnm2 = Tiling_Problem(n-2);

        // total Choices 
        return fnm1 + fnm2;

    }
}
