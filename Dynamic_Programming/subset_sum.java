class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        
        boolean dp[][]=new boolean[N+1][sum+1];
        
       
        for(int j=0;j<=sum;j++)
        dp[0][j]=false;
        
         for(int i=0;i<=N;i++)
        dp[i][0]=true;
        
        
        
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                int x=arr[i-1];
                if(x>j)
                {
                    dp[i][j]=dp[i-1][j];
                }
                else
                {
                    if(j-x>=0)
                    {
                        
                        if(dp[i-1][j-x]==true || dp[i-1][j]==true)
                        dp[i][j]=true;
                       
                    }
                    else
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
//      System.out.println(N+" "+sum);
// System.out.println(dp[N][sum]);   
//         for(int i=0;i<=N;i++)
//         {
//             for(int j=0;j<=sum;j++)
//             {
//                 System.out.print(dp[i][j]+ " ");
//             }
//             System.out.println();
//         }


        return dp[N][sum];
    }
}
