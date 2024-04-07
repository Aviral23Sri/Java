package ArrayList;
import java.util.*;

public class CreationArraylist {
    public static void main(String args[]){
        // Creating an Array List

        ArrayList<Integer> list = new ArrayList<>();
 //         ^       ^        ^     ^          ^
    //Arraylist Data Type  Name   keyword object creation

        list.add(1);    // O(1)
        list.add(2);
        list.add(3);                          // Add Function => Use to add elements to array list    -- O(1)
        list.add(4);
        // To add any Element at given index 
        list.add(1,11);      // To add any Element at given index 
        System.out.println(list);
        System.out.println(list.get(0));   // Get Funtion  => Use toget the value for the given index in an array list  -- O(1)

        list.remove(0);                    // Remove Function => Use to Delete an Element in Array List           -- O(n)
        System.out.println(list);

        list.set(1, 6);            // Set Function  => Use to set the value at given index         -- O(n)
        System.out.println(list);

        System.out.println(list.contains(2));  // Contains Funtion => It retuns a boolean value for a give Number that exist or soestnt exists in array list
        System.out.println(list.size());
    
    }
    
}
