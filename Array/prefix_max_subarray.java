package Array;

public class prefix_max_subarray {
    public static void main(String args[]){
        int arr[]= {2,4,6,8,10};
        prefix(arr);
    }
    public static void prefix(int arr[]){
        int current=0;
        int prefix[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            current=0;
            for(int j=0;j<=i;j++)
            {
                current += arr[j];
            }
            prefix[i]= current;
        }

        for(int k=0;k<prefix.length;k++)
        {
            System.out.println(prefix[k]);
        }
    }
}
