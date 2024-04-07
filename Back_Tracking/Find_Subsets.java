package Back_Tracking;

public class Find_Subsets {
    public static void main(String args[]){
        String str = "abc";
        String ans= "";
        Find_Subsets(str, ans, 0);
    }
    public static void Find_Subsets(String str,String ans , int i){
        // Base Case 
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        // Recursion 

        // Yes 
        Find_Subsets(str, ans+str.charAt(i), i+1);
        Find_Subsets(str,ans, i+1);
    }
    
}
