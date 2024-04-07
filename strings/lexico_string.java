package strings;

import Array.largest_number;

public class lexico_string {
    public static void main(String args[]){
        String arr[] = {"aviral","srivastava","etc"};
        
        String max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max.compareTo(arr[i])<0)
            {
                max = arr[i];
            }
        }
        System.out.println("Max is => "+ max);
    }
    
}
