import java.util.*;
public class Main
{
    public static int solve(int ar[][],int n)
    {
        int dp[][]=new int[n][3];
        for(int i=0;i<3;i++)
        dp[0][i]=ar[0][i];
        
       
      for(int i=1;i<n;i++)
      {
          for(int j=0;j<3;j++)
          {
              if(j==0)
              {
                  dp[i][j]=ar[i][j]+(Math.max(dp[i-1][j+1],dp[i-1][j+2]));
              }
              else if(j==1)
              {
                  dp[i][j]=ar[i][j]+Math.max(dp[i-1][j+1],dp[i-1][j-1]);
              }
              else
              dp[i][j]=ar[i][j]+Math.max(dp[i-1][j-1],dp[i-1][j-2]);
          }
      }
     
      int max=0;
      for(int i=0;i<3;i++)
      max=Math.max(max,dp[n-1][i]);
      return max;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int k=sc.nextInt();
	int ar[][]=new int[n][3];
		for(int i=0;i<n;i++){
		for(int j=0;j<3;j++){
		ar[i][j]=sc.nextInt();
		}
		}
		System.out.println(solve(ar,n));
		
	}
}
