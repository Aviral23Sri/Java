package leetcode;
import java.util.*;
public class isomorphic {
    public static void main(String argso[]){
        String s = "egg";
        String t = "add";
        System.out.println(s.length());
        if(isIsomorphic(s,t)){
            System.out.println("Isomorphic");
        } else{
            System.out.println("Not Isomorphic");
        }
    }
    public static boolean isIsomorphic(String s,String t){
        char arr1[] = new char[s.length()];
        char arr2[] = new char[s.length()];

        for(int i=0;i<s.length();i++)
        {
            int a =cheack(s.charAt(i), arr1);
            if(a==-1){
                arr1[i]= s.charAt(i);
                arr2[i]= t.charAt(i);
            } else {
                System.out.println(arr2[a]);
                System.out.println(i);
                System.out.println(arr2[i]);
                if(arr2[a]==arr2[i]){
                    System.out.println("aa");
                } else {
                    return false;
                }
            }
        }
        return true;
            
        
    }
    public static int cheack(char a,char arr1[]){
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==a){
                System.out.println(i);
                return i;
                
            }
        }
        return -1;
    }
    
}
