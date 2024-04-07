package ArrayList;
import java.util.*;
public class SortingInList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(5);
        list.add(1);
        Collections.sort(list);       // Ascending           // Using Inbuilt Method for sorting 
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());       // Decending Order Sorting
        System.out.println(list);
    }
}
