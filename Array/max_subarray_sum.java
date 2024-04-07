package Array;

public class max_subarray_sum {
    public static void main(String args[]){
        // int arr[]= {1,-2,6,-1,3};
        int arr[]= {2,4,6,8,10};
        max_subarray_sum(arr);
    }
    public static void max_subarray_sum(int arr[]){
        int max = Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<arr.length;i++)
        {
            int start = i;
            for(int j=i;j<arr.length;j++)
            {
                int end = j;
                current = 0;
                for(int k=start;k<=end;k++)
                {
                    current = current + arr[k];
                    
                }
                if(current>max)
                    {
                        max = current;
                    }
            }
            System.out.println();
        }
        System.out.println("max =>"+ max);
    }
}
