import java.util.*;
public class odd_even {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0)
        {
            System.out.println("number is even" + num + "btbd");
        } else{
            System.out.println(" Odd");
        }
        sc.close();

    }
    
}
