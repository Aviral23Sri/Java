package strings;
import java.util.*;

public class creation3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();           // Takes ONly One Word 
        // String str1 = sc.nextLine();
        // System.err.println(str1);

        // System.out.println(str1.length());                  // To find The Length Of String 

        
        
        // CONCATATION 
        String str1 = sc.nextLine();
        String str2 = sc.next();                              // CONCATATION   
        String full_name = str1 + str2;
        System.out.println(full_name);

        System.out.println(str1.charAt(1));               // Char At Method 
    }
}
