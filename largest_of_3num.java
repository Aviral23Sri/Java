import java.util.*;
public class largest_of_3num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("Number=> "+ a +" is greater");
            }else{
                System.out.println("Number=> "+ c +" is greater");
            }
        }
        else{
            if(b>c){
                System.out.println("Number=> "+ b +" is greater");
            } else{
                System.out.println("Number=> "+ c +" is greater");
            }
        }
        sc.close();
    }
    
}
