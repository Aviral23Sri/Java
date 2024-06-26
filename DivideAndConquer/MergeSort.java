package DivideAndConquer;

public class MergeSort {
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        MergeSort(arr, 0, arr.length-1);
        PrintArr(arr);

    }
    public static void MergeSort(int arr[],int si,int ei){
        // For Dividing the Array 
        if(si>=ei){
            return;
        }

        //kaam
        int mid = si + (ei-si)/2;
        MergeSort(arr,si, mid); // Left Part
        MergeSort(arr,mid+1, ei);// Right Part 
        merge(arr,si,mid,ei);

    }
    public static void merge(int arr[],int si,int mid , int ei){
        int temp[] = new int[ei-si+1]; // Making a temporary Array 
        int i = si; // Iterator for left part 
        int j = ei; // Iterator for Right part
        int k = 0; // Iterator for Temp Array
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++;k++;
            } else{
                temp[k]= arr[j];
                j++;k++;
            }
        }

        // If any elemnt is still in right or left part
        // For Right Part
        while(i<=mid){
            temp[k]= arr[i];
            k++;i++;
        }
        while(j<=ei){
            temp[k]= arr[j];
            j++;k++;
        }


        // Copy the Temp array to origional
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

}
