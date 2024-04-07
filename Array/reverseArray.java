package Array;

public class reverseArray {
    public static void main(String args[]){
    int arr[] = {2,4,6,8,10};
    int i;
    System.out.println("BEFORE :- ");
    for(i =0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
    System.out.println(" AFTER REVERSING :- ");
    reverse(arr);
    for(i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }

    }
    public static void reverse(int arr[]){
        int temp;
        int first=0;
        int last = arr.length-1;
        while(first<last)
        {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            last--;
            first++;
            
        }
        
    }
}
