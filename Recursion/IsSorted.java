package Recursion;
// import java.util.*;
public class IsSorted {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        int arr[] = { 1,2,3,8,4,5,6,7};
        System.out.println(isSorted(arr, 0));
    }

    public static boolean isSorted(int arr[], int i){
        if(arr.length-1==i){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
}