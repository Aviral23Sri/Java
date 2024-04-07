package DivideAndConquer;

public class QuickSort {
   public static void main(String argso[]){
        int arr[] = {6,3,9,8,2,5};
        QuickSort(arr,0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

   }
   public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //last element
        int pidx = partation(arr,si,ei);
        QuickSort(arr, si,pidx-1); //left part
        QuickSort(arr, pidx+1,ei); //Right Part

   }
   public static int partation(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;  // To make place and swap the elements
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
   }
    
}
