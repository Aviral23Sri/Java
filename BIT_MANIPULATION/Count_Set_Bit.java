package BIT_MANIPULATION;
import java.util.*;

import Sorting.counting_sort;
public class Count_Set_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Count_Set_Bit(n));
    }
    public static int Count_Set_Bit(int n){
        int count=0;
        while(n>0)
        {
            if((n & 1)!=0 )
            {
                count ++;
            }
            n=n>>1;
        }
        return count;
    }
}
