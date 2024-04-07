package Recursion;

public class PQ1 {
    public static void main(String args[]){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        PQ1(arr, key,0);
    }


    public static void PQ1(int arr[],int key,int idx){
        if(idx == arr.length){
            return ;
        }
        //kaam 
        if(arr[idx]==key){
            System.out.print(idx+ " ");
        }
        PQ1(arr, key, idx+1);
        
    }
    
}
