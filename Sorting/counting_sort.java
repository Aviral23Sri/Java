package Sorting;

public class counting_sort {
    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,4,3,7};
        counting_sort(arr);
    }
    public static void counting_sort(int arr[]){
        int arr_freq[]= new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int index = arr[i];
            arr_freq[index] += 1;
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr_freq[i];j++)
            {
                arr[count] = i;
                count++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

    
}
