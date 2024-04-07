import java.util.*;
public class binary_triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of N =>");
        int num = sc.nextInt();
        binaty_triangle(num);

    }
    public static void binaty_triangle(int num){
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
