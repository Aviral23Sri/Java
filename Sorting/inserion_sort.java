package Sorting;
import java.util.*;

public class inserion_sort {
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        inserion_sort(arr);

    }
    public static void inserion_sort(int arr[]){
        for(int i=1;i<arr.length;i++)
        {
            int current = arr[i];
            int prev = i-1;
            // finding currect position to insert 
            while(prev>=0 && current<prev)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion 
            arr[prev+1] = current;

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
