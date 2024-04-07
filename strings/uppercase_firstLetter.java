package strings;
import java.util.*;
public class uppercase_firstLetter {
    public static void main(String args[]){
        String str = "hello i am aviral";
        String str1 = toUpperCase(str);
        System.out.println(str1);
    }
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                sb.append(' ');
                ch = Character.toUpperCase(str.charAt(i+1));
                sb.append(ch);
                i++;
            }
            else{
                sb.append(str.charAt(i));
            }
            

        }
        return sb.toString();            // Changing object to String 
    }
    
}
