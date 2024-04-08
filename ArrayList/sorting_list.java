package ArrayList;
import java.util.*;
public class sorting_list {
    public static void main(String Args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(11);
        list.add(12);
        list.add(6);
        list.add(9);
        list.add(10);

        Collections.sort(list); // For Sorting the elements in an Array List
        System.out.println(list);
    }
}
