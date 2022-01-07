class Solution {
    public int maxProfit(int[] prices) {
        
        int max_profit=0;
        int buy=prices[0];
        
        
        for(int i=1;i<prices.length;i++)
        {
            int val=prices[i];
            if(val>buy)
            {
                int diff=val-buy;
                max_profit=Math.max(max_profit,diff);
            }
            else
            {
                buy=prices[i];
            }
        }
        return max_profit;
    }
}
