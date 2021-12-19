
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static int topDown(int n,int dp[],int k)
{
    if(n<=0)
    return 0;
    if(n==1)
    return 1;
    
 if(dp[n]!=-1)
 return dp[n];
   int ways=0;
    for(int i=1;i<=k;i++)
    {
        ways+=topDown(n-i,dp,k);
    }
    return dp[n]=ways;
}

public static int bottomUp(int n,int k)
{
    int dp[]=new int[n+1];  /// 1 2 4 7 
    dp[1]=1;
    dp[0]=0;
    for(int i=2;i<=k;i++)
    {
        int sum=0;
        for(int j=i-1;j>=0;j--)
        sum=sum+dp[j];

        dp[i]=sum;
    }
    for(int i=k+1;i<=n;i++)
    {
        for(int j=1;j<=k;j++)
        {
            dp[i]+=dp[i-j];
        }     
    }
    return dp[n];
}
public static int bottomUpOptimized(int n,int k)
{
    int dp[]=new int[n+1];  /// 1 2 4 7 
    dp[1]=1;
    dp[0]=0;
    for(int i=2;i<=k;i++)
    {
        int sum=0;
        for(int j=i-1;j>=0;j--)
        sum=sum+dp[j];

        dp[i]=sum;
    }
    for(int i=k+1;i<=n;i++)
    {
      

        dp[i]=2*dp[i-1]-dp[i-k-1];
        
    }
    return dp[n];
}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(topDown(n,dp,k));
        System.out.println(bottomUp(n,k));
        System.out.println(bottomUpOptimized(n,k));
	}
}
