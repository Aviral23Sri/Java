import java.util.*;
public class imcometax_calc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the Salary Amount => ");
        int salary = sc.nextInt();
        int tax;
        
        if(salary<500000){
            tax= 0;
        }
        else if(salary>500000 && salary<1000000){
            tax =20;
            // System.out.println(tax);
        }
        else{
            tax =30;
        }

        float tax_amount = (tax/100f) * salary ;
        System.out.println(" Total Tax on Salary => " + tax_amount);

        float total_salary = salary - tax_amount;

        System.out.println(" Total in Hand Salary=> " + total_salary);
        sc.close();
    }
    
}
