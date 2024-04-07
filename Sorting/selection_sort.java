package Sorting;

public class selection_sort {
    public static void main(String args[]){
        int arr[]= {4,5,1,3,2};
        selection_sort(arr);
    }
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos =i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minPos])
                {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
