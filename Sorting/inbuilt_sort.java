package Sorting;
import java.util.*;
public class inbuilt_sort {
    public static void main(String args[]){
        Integer arr[]={2,7,6,5,2,8,10};   // object integer
        // Arrays.sort(arr);
        //Arrays.sort(arr,0,4);  // For sorting accordnig to the index
        Arrays.sort(arr,Collections.reverseOrder()); // not applicabe in primitive we have to create a object Integer
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
