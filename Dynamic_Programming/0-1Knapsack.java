class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         
         
         
         int dp[][]=new int[n+1][W+1];
         
         
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=W;j++)
             {
                 int g=wt[i-1];
                 
                 
                 int x=0;
                 int y=0;
                 y=dp[i-1][j];
                 
                 if(j-g>=0){
                y=Math.max(y,dp[i-1][j-g]+val[i-1]);
                 }
                 
                 dp[i][j]=y;
             }
         }
         
         
        //  for(int i=0;i<=n;i++)
        //  {
        //      for(int j=0;j<=W;j++)
        //      {
        //          System.out.print(dp[i][j]+" ");
        //      }
        //      System.out.println();
        //  }
         return dp[n][W];
    } 
}


