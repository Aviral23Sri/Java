package BIT_MANIPULATION;
import java.util.*;
public class Clear_Range_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(Clear_Range_bits(i, n));
    }
    public static int Clear_Range_bits(int n, int i){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n& b;
    }
}
