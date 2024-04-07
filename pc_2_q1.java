import java.util.*;
public class pc_2_q1 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First Number =>");
        float a = sc.nextFloat();
        System.out.print("\nEnter the Second Number =>");
        float b = sc.nextFloat();
        System.out.print("\nEnter the Third Number =>");
        float c = sc.nextFloat();

        float average = (a+b+c) /3.0f;
        System.out.print("The Average is =>");
        System.out.print(average);
        sc.close();
    }
    
}
