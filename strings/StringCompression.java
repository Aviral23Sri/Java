package strings;
import java.util.*;
public class StringCompression {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.length());
        String x = StringCompression(str);
        System.out.println(x);
    }
    public static String StringCompression(String str){
        Integer count;
        String str2="";
        
        for(int i=0;i<str.length();i++)
        {
            count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            str2 += str.charAt(i);
            if(count>1){
                str2 += count.toString();
            }
            
            

        }
        return str2;
    }
    
}
