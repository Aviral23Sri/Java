import java.util.*;
public class butterfly {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num =sc.nextInt();
        butterfly(num);

    }
    public static void butterfly(int num){
        int k=1;
        int i;
        for(i=1;i<=num;i++)
        {
            
                int stars = i;
                for(k=1;k<=stars;k++)
                {
                    System.out.print("*");
                }
                int space = (num*2) -(i*2);
                for(k=1;k<=space;k++)
                {
                    System.out.print(" ");
                }
                for(k=1;k<=stars;k++)
                {
                    System.out.print("*");
                }
            
            System.out.println();
        }
        for(i=num;i>=1;i--)
        {
            int stars = i;
            int space = (num*2) - (i*2);
            for(k=1;k<=stars;k++)
            {
                System.out.print("*");
            }
            for(k=1;k<=space;k++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=stars;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
