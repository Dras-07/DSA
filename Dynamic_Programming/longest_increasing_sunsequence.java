class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        // code here
        
        int dp[]=new int[size];
        
        
        dp[0]=1;
        int umax=1;
        for(int i=1;i<size;i++)
        {
            int x=a[i];
            int max=0;
            for(int j=0;j<i;j++)
            {
                if(x>a[j])
                {
                    max=Math.max(max,dp[j]);
                }
                
            }
            dp[i]=max+1;
            umax=Math.max(umax,dp[i]);
        }
    return umax;
    }
} 
