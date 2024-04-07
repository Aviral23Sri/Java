package Array;



public class stocks {
    public static void main(String args[]){
        int arr[] = {7,1,5,3,6,4};
        int x =max_profit(arr);
        System.out.println(x);

    }
    public static int max_profit(int arr[]){
        int profit=0;
        int current_profit=0;
        int buy_price = Integer.MAX_VALUE;
        int selling_price;
        for(int i=0;i<arr.length;i++)
        {
            buy_price = buy_price>arr[i]? arr[i]: buy_price;
            selling_price= arr[i];
            current_profit = selling_price-buy_price;
            
            profit = Math.max(profit,current_profit);
        }
        return profit;
        
    }
    
}
