package strings;
import java.util.*;

public class palindromeString {
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean x= palindromeString(str);
        System.out.println(x);
    }
    public static boolean palindromeString(String str){
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
}
