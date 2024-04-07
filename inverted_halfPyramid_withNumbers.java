import java.util.*;
public class inverted_halfPyramid_withNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int loop =n;
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1; j<=loop;j++)
            {
                System.out.print(j);
            }
            loop--;
            System.out.println();
        }
    }
}
