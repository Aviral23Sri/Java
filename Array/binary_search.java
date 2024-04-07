package Array;

public class binary_search {
    public static void main(String args[]){
        int arr[]= {2,4,6,8,10,12,14};
        int key = 10;
        int x = binary_search(arr, key);
        System.out.println("Element "+ key + " Found on index =>"+ x);
        if(x==-1){
            System.out.println("Element Not Found");
        }
    }
    public static int binary_search(int arr[], int key){
        int start = 0;
        int end= arr.length -1;
        while(start<=end)
        {
            int mid = (int)(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }

            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
