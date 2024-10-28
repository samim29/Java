import java.util.*;

public class Stocks {

    public static int stocksProfitCalculate(int prices[]){
        int n=prices.length;
        int buyPrice=Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<n;i++){
            
            if(buyPrice<prices[i]){
                int currProfit=prices[i]-buyPrice;
               MaxProfit=Math.max(currProfit,MaxProfit);
            }
            else{
                buyPrice=prices[i];
            }
            
        }
        return MaxProfit;
    }
    
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("Max Profit: "+stocksProfitCalculate(prices));
    }
}
