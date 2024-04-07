package Recursion;

public class Optimized_Pow {
    public static void main(String args[]){
        int x = 2;
        int n = 10;
        System.out.println(Optimized_Pow(x, n));
    }

    public static int Optimized_Pow(int x, int n){
        if(n==1)
        {
            return x;

        }
        int hlfpow = Optimized_Pow(x, n/2);
        int hlfpowsq = hlfpow *hlfpow;
        return hlfpowsq;
    }
    
}
