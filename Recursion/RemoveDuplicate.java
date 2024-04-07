package Recursion;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String args[]){
        String str = "aabbccdr";
        String newstr = "";
        Boolean arr[] = new Boolean[26];
        RemoveDuplicate(0, str, null, arr);
        
    }
    public static void RemoveDuplicate(int idx , String str ,StringBuilder newstr ,Boolean arr[] ){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        // kaam 
        char currchr = str.charAt(idx);
        if(arr[currchr- 'a']== true){
            // duplicate
            RemoveDuplicate(idx+1, str, newstr, arr);
        }
        else{
            arr[currchr - 'a']= true;
            RemoveDuplicate(idx+1, str, newstr.append(currchr), arr);
        }

    }
}
