class Solution {
    
    
    public int solve(int []coins,int s,Integer dp[])
    {
        
      if(s==0){
          dp[s]=0;
          return 0;
      }
        
        if(s<0)
            return -1;
        
        if(dp[s]!=null)
            return dp[s];
        
        int min=Integer.MAX_VALUE;
        for(int i:coins)
        {
            int x=solve(coins,s-i,dp);
            if(x>=0)
            {
                min=Math.min(min,x);
            }
                
        }
        if(min==Integer.MAX_VALUE)
            return dp[s]=-1;
        else
        return dp[s]=min+1;
    }
    public int coinChange(int[] coins, int amount) {
        
        
        Integer dp[]=new Integer[amount+1];
        
      
       dp[0]=0;
        
        
    int x=solve(coins,amount,dp);
        
        return x;
        
        
    }
}
