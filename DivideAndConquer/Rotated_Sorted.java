package DivideAndConquer;

public class Rotated_Sorted {
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        int tar = 0;
        System.out.println(search(arr, tar, 0, arr.length-1));
    }

    public static int search(int arr[],int tar,int si,int ei ){
        if(si>ei){
            return -1;
        }
        // kaam 
        int mid = si+ (ei-si)/2;
        // Case Found 
        if(arr[mid]==tar){
            return mid;
        }

        // Mid on L1
        if(arr[si]<=arr[mid]){
            // Case a Left 
            if(arr[si]<= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid);
            }else{
                // Case b Right
                return search(arr, tar, mid+1, ei);
            }
        }

        // Mid On L2
        else{
            // Case c right 
            if(arr[mid]<=tar&&tar<=arr[ei]){
                return search(arr, tar, mid+1 , ei);
            }else{
                return search(arr, tar, si, mid);
            }

        }
    }
    
}
