package Recursion;

import java.security.Key;

public class First_Occurance {
    public static void main(String args[]){
        int arr[] = {8,3,6,9,5,2,5,3};
        int key = 3;
       System.out.println(First_Occurance(arr,0, key));
    }

    public static int First_Occurance(int arr[],int i,int key){
        if(i==arr.length ){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return First_Occurance(arr, i+1, key);
    }
}
