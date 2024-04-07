import java.util.*;
public class solid_rhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number =>");
        int num = sc.nextInt();
        solid_rhombus(num);
    }
    public static void solid_rhombus(int num){
        int j;
        for(int i=5;i>=1;i--)
        {
            for(j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=num;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
