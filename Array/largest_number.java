package Array;
public class largest_number {
    public static void main(String args[]){
        int arr[] = {1,2,6,3,5};
        // int largest = largest(arr);
        // System.out.println(largest);
        int smallest = smallest(arr);
        System.out.println(" Smallest VAlue is =>" + smallest);
    }
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;               // - Infinity = Integer.MIN_VALUE
                                                       // - Infinity = Integer.MAX_VALUE
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int smallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            
            if(smallest>arr[i])
            {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
