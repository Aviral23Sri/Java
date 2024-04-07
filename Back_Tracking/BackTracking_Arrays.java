package Back_Tracking;

public class BackTracking_Arrays {
    public static void main(String args[]){
        int arr[] = new int[5];
        BackTracking_Arrays(arr, 0, 1);
        System.out.println();
        PrintArr(arr);
    }
    public static void BackTracking_Arrays(int arr[],int i, int val){
        // Base Case
        if(i==arr.length){
            PrintArr(arr);
            return;
        }

        // Recursion
        arr[i]=val;
        BackTracking_Arrays(arr,i+1,val+1);
        arr[i]= arr[i]-2;              // BackTracking 
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
