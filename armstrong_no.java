import java.util.*;
public class armstrong_no {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        armstrong(num);
    }
    public static void armstrong(int num){
        int num1= num;
        int last_dig;
        int arm=0;
        while(num>0)
        {
            last_dig = num%10;
            last_dig = (int)Math.pow(last_dig,3);
            arm = arm+last_dig;
            num = num/10;
        }
        System.out.println(arm);
    }
    
}
