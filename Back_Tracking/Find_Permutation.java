package Back_Tracking;

public class Find_Permutation {
    public static void main(String args[]){
        String str = "abc";
        String ans = "";
        Find_Permutation(str, ans);
    }
    public static void Find_Permutation(String str , String ans){
        // Base Case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //kaam
        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            Find_Permutation(newstr,ans+curr);
        }
    }
    
}
