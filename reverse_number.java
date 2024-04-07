import java.util.*;
public class reverse_number {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        sc.close();
        int i=0;
        int last_digadd;
        
        for( i=0;num>0;i++)
        {
            last_digadd = num%10;
            System.out.print(last_digadd);
            num=num/10;
            
        }
       
    }
}
