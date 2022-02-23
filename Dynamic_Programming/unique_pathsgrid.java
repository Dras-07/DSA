class Solution {
    
    public int solve(int dp[][],int m,int n)
    {
        if(m==0 || n==0)
            return 1;
        
        if(dp[m][n]!=0)
            return dp[m][n];
        int ways=solve(dp,m,n-1)+solve(dp,m-1,n);
        return dp[m][n]=ways;
    }
    public int uniquePaths(int m, int n) {
     
        int dp[][]=new int [m][n];
       return solve(dp,m-1,n-1);
    }
}
