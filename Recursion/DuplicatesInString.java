package Recursion;

public class DuplicatesInString {
    public static void main(String args[]){
        String str = "aviral";
        duplicateString(str, 0, new StringBuilder(""),new boolean [26]);
    }

    public static void duplicateString(String str , int idx , StringBuilder newstr , boolean map[]){
        //Base Case
    if(idx == str.length()){
        System.out.println(newstr);
    }

    // kaam 
    char currchar = str.charAt(idx);
    if(map[currchar-'a']== true){
        // Duplicate
        duplicateString(str, idx+1, newstr, map);
    }
    else {
        // Non Duplicate 
        map[currchar - 'a']=true;
        duplicateString(str, idx+1, newstr.append(currchar), map);

    }

}
}
