package Array;

import javax.crypto.Mac;

public class prefix_subarray2 {
    public static void main(String args[]){
        int arr[] ={2,4,6,8,10};
        prefix(arr);
    }
    public static void prefix(int arr[]){
        int prefix[] = new int[arr.length];
        int i,current_sum;
        int max_sum = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        for(i=1;i<prefix.length;i++)
        {
            prefix[i]= prefix[i-1] + arr[i];
        }
        for(i=0;i<arr.length;i++)
        {
                for(int j=i;j<arr.length;j++)
                {
                    current_sum = i==0? prefix[j] :  prefix[j] - prefix[i-1];
                    if(current_sum>max_sum)
                    {
                        max_sum = current_sum;
                    }
                }
                
        }
        System.out.println(" Max Sum =>" + max_sum);
    }
    
}
