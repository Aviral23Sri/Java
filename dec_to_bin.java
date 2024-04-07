import java.util.*;
public class dec_to_bin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();
        dec_to_bin(10);
    }
    public static void dec_to_bin(int dec){
        int bin=0;
        int pow=0;
        while(dec > 0)
        {
            int rem = dec%2;
            bin = bin + (rem *(int)Math.pow(10,pow));
            pow++;
            dec = dec/10; 
            // System.out.println(bin);
            // System.out.println(dec);
            // System.out.println(pow);
        }
        System.out.println(bin);
    }
}
