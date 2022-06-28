class Solution {
    
    public int solve(int n,int dp[])
    {
        if(n==0)
            return 0;
        
        if(n==1)
            return 1;
        
        if(n<0)
            return -1;     
        if(dp[n]!=10000)
        return dp[n];
        
        boolean flag=false;
        
        for(int i=1;i*i<=n;i++)
        {
            int x=solve(n-i*i,dp);
            if(x>=0)
            {
              dp[n]=Math.min(dp[n],x+1);
              flag=true;
            }
        }        
        if(flag==false)
            return -1;
        else
        return dp[n];
    }
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,10000);
        return solve(n,dp);
        
    }
}
