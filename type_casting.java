import java.util.*;
public class type_casting {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a =3.14f;
        int b = (int)a; //This is how we type cast a variable 
        sc.close();
        System.out.println(b);
        
        char ch ='a';
        int number =ch;   // Gives the ascai Value of a number
        System.out.println(number);
    }
    
}
