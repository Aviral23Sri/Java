package Array;

public class trapping_rainwater {
    public static void main(String args[]){
        int arr[] = {4,2,0,6,3,2,5};
        trapping_rainwater(arr);
    }
    public static void trapping_rainwater(int arr[]){
        int left_max = Integer.MIN_VALUE,j;
        int right_max = Integer.MIN_VALUE;
        int trapped_water=0;
        int current_trapped=0;
        for(int i=0;i<arr.length;i++)
        {
            // for left max
            if(i==0 || i==arr.length-1)
            {
                current_trapped=0;
            }
            else{
                    for(j=0;j<i;j++)
                    {
                        if(arr[j]>left_max)
                        {
                            left_max = arr[j];
                        }
                    }
                    // for right max 
                    for(j=i+1;j<arr.length;j++)
                    {
                        if(arr[j]>right_max)
                        {
                            right_max = arr[j];
                        }
                    }
                    int min = Math.min(right_max,left_max);
                    current_trapped = min-arr[i] *1;
                    trapped_water += current_trapped;
                }    
           
            
        }
        System.out.println(trapped_water);
    }
}
