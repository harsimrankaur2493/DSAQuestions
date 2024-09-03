class Solution {
    public int maxProfit(int[] prices) {
        
        int buyPrice=prices[0]; //buying day
        int profit=0;  //selling day
        for(int i=1;i<prices.length;i++){
            if(buyPrice > prices[i]){
                buyPrice= prices[i];

            }
            profit = Math.max(profit, prices[i]-buyPrice);
        }


        return profit;
    }

    
}