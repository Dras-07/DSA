class Solution {
    public int change(int amount, int[] coins) {
        
        int dp[]=new int[amount+1];
        dp[0]=1;
        for(int i:coins)
        {
            for(int j=i;j<=amount;j++)
            {
               
                    dp[j]+=dp[j-i];
                
            
            }
        }
        return dp[amount];
    }
}
