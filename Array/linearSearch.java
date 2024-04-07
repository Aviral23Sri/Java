package Array;
public class linearSearch {
    public static void main(String args[]){
        int numbers[] = {1,2,3,5,10,6,9,17};
        int key = 10;
        int index = LinearSearch(numbers, key);
        System.out.println(index);
    }
    public static int LinearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
            
        }
        return -1;
    }
}
