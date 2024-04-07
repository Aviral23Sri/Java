import java.util.*;
public class reverse2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0,last_dig;
        for(int i=0; num>0;i++)
        {
            last_dig = num%10;
            rev = (rev*10)+ last_dig;
            num= num/10;
        }
        System.out.println("Reverse Number => "+ rev);
        sc.close();
    }
    
}
