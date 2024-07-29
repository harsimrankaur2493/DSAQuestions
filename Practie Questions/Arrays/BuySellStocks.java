// Given an array prices[] of length N, representing the prices 
// of the stocks on different days, the task is to find the maximum
//  profit possible by buying and selling the stocks on different
//   days when at most one transaction is allowed.
import java.util.*;
public class BuySellStocks{
    //brute force
    public static void maxDiff(int prices[]){
        int maxDiff=Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++){
            for(int j=i; j<prices.length; j++){
                int currDiff = (prices[j] - prices[i]);
                if(currDiff > maxDiff){
                    maxDiff = Math.max(maxDiff , currDiff );
                }
            }
        }
        System.out.println(maxDiff);
    }
    //optimized approach 

    public static void maxDiffOptimized(int prices[], int n){
        int buy= prices[0] ;    //store a buying price(least price)
        int maxProfit = 0;//storing maximum profit
        for(int i=1; i<n; i++){ //starting with the 2nd day price cause minimum to minimum buying should be done on day 1
            if(buy > prices[i]){
                buy=prices[i];  //if day i has an even lower price, buy = price of day i
            }
            else if(prices[i] - buy > maxProfit){   //if max profit if smaller than current profit
                maxProfit =prices[i]- buy;  //max profit updated 
            }
        }
        System.out.println(maxProfit);
    }
    public static void main(String []args){
        int prices[]={7, 1, 5, 3, 6, 4};
        maxDiffOptimized(prices, 6);

    }
}
