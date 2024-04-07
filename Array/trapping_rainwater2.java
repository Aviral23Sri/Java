package Array;

public class trapping_rainwater2 {
    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        int x = trapped_water(arr);
        System.out.println(x);
    }
    public static int trapped_water(int arr[]){
        // left max boundry 
        int left_max[]= new int[arr.length];
        int right_max[] = new int[arr.length];
        left_max[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            left_max[i] = Math.max(arr[i],left_max[i-1]);
        }
        // right max boundry 
        right_max[right_max.length-1] = arr[arr.length-1];
        for(int j=arr.length-2;j>=0;j--)
        {
            right_max[j] = Math.max(arr[j], right_max[j+1]);
        }
        int trapped_water =0;
        for(int i=0;i<arr.length ;i++)
        {
            int water_level = Math.min(left_max[i],right_max[i]);
            trapped_water += water_level - arr[i];
        }
        return trapped_water;
    }
}
