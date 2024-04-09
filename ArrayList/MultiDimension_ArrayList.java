package ArrayList;
import java.util.*;
public class MultiDimension_ArrayList {
    public static void main(String Args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1); list.add(2);
        mainList.add(list);

        System.out.println(mainList);  // Adding a List to The main Lsit

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        System.out.println(mainList);

        for(int i=0 ; i<mainList.size();i++)
        {
            ArrayList<Integer> currlist = mainList.get(i);
            for(int j=0;j<currlist.size();j++)
            {
                System.out.print(currlist.get(j)+ "\t");
            }
            System.out.println();
        }



    }
    
}
