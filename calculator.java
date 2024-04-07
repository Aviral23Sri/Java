import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'A' =>" );
        int a = sc.nextInt();
        System.out.print("Enter the value of 'B' =>" );
        int b = sc.nextInt();
        System.out.println("Enter the Operation :-> \n (+) Addition\n (-) Substraction\n (*) Multiplication\n (/) Division\n (%) Reminder\n");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case '+':
                        System.out.println(" Answer is =>"+ a+b);
                        break; 
            case '-':
                        System.out.print("Answer is =>");
                        System.out.println(a-b);
                        break;
            case '*':
                        System.out.println(); 
                        System.out.println(" Answer is =>"+ a*b);
                        break;
            case '/':
                        System.out.println(" Answer is =>"+ a/b); 
                        break;
            case '%':
                        System.out.println(" Answer is =>"+ a%b); 
                                   
            sc.close();                       

                       
        }

        
    }
    
}
