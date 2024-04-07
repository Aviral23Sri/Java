package leetcode;

public class roman_to_integer {
    public static void main(String args[]){
            String s = "bbbaaaba";
            String t ="aaabbbba";
            StringBuilder str = new StringBuilder();
            StringBuilder str2 = new StringBuilder();
            int s_final = 0;
            int t_final =0;

            for(int i=0;i<s.length();i++)
            {
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j)){
                        str.append(i);
                        str.append(j);
                    }
                    if (t.charAt(i)==t.charAt(j)){
                        str2.append(i);
                        str2.append(j);
                    }
                }
            }
            System.out.println(str);
            System.out.println(str2);
            int isiso = str.compareTo(str2);
            System.out.println(isiso);
            if(isiso == 0){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
            
    }
}
