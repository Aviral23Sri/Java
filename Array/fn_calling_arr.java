package Array;

public class fn_calling_arr {
    public static void main(String args[]){ // Function argument 
        int arr[]={1,2,3}; 
        update(arr); 
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);    // CALL BY REFRENCE 
        }  
    }
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            arr[i] += 1;
        }
    }

}
