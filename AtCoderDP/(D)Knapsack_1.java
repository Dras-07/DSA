import java.util.*;
 public class D_Knapsack_1{

    public static long solve(int w,int wt[],int n,int val[])
    {
        long dp[][]=new long[w+1][n+1];
        

        for(int i=1;i<=w;i++){
            for(int j=1;j<=n;j++){
            if(wt[j-1]>i)
            {
                //if(i==3)
                //System.out.println("ans="+dp[i][j-1]+" "+dp[i][j]+" j="+j+" "+wt[j-1]);
                dp[i][j]=dp[i][j-1];
            }
            else
             {
                 //int x=0;
                 if(i-wt[j-1]>=0)
                 {
                     dp[i][j]=Math.max(val[j-1]+dp[i-wt[j-1]][j-1],dp[i][j-1]);
                 }
             }
            }
        }
        
        return dp[w][n];
    }

    public static void main(String[] args)throws Exception
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int w=sc.nextInt();
            int val[]=new int[n];
            int wt[]=new int[n];
            for(int i=0; i<n; i++)
            {
                wt[i]=sc.nextInt();
                val[i]=sc.nextInt();        
            }
    System.out.println(solve(w,wt,n,val));
        }

    }
}
