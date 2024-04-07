import java.util.*;
public class hollow_rhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        hollow_rhombus(num);
        sc.close();
    }
    public static void hollow_rhombus(int num){
        int j;
        for(int i=5;i>=1;i--)
        {
            for(j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            if(i==1 || i==num)
            {
                for(j=1;j<=num;j++)
                {
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(j=1;j<=num-2;j++)
                {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
