import java.util.*;
public class pc_2_q2 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Side of a Square =>");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("The Area Of a Square is =>" +area);
        sc.close();
    }
    
}
