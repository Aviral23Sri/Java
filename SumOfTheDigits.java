import java.util.*;
public class SumOfTheDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number =>");
        int num = sc.nextInt();
        int x = SumOfNumber(num);
        System.out.println("The Sum Of Digits is => " + x);
    }
    public static int SumOfNumber(int num){
        int sum =0;
        int last_dig = 0;
        while(num>0)
        {
            last_dig = num%10;
            sum = sum +last_dig;
            num = num/10;
        }
        return sum;
    }
    
}
