import java.util.*;
public class decimal_to_bin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Binary Number to Convert =>");
        int bin = sc.nextInt();
        bin_to_dec(bin);
        sc.close();
    }
    public static void bin_to_dec(int bin){
        int munum = bin;
        int dec =0;
        int pow =0;
        while(bin>0)
        {
            int last_dig = bin%10;
            dec = dec + (last_dig * (int)Math.pow(2,pow));
            pow++;
            bin = bin/10;
        }
        System.out.println("The Decimal value of "+ munum +" is =>"+dec);
    }
}
