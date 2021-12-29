import java.util.*;
public class Main
{
    public static int solve(int ar[],int n,int k)
    {
        int dp[]=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(ar[0]-ar[1]);
        if(n==2)
        return Math.abs(ar[0]-ar[1]);
       
      
        for(int i=2;i<n;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=Math.min(i,k);j++)
            {
                int val=dp[i-j]+(Math.abs(ar[i]-ar[i-j]));
                min=Math.min(min,val);
            }
            dp[i]=min;
        }
        
        //for(int i=0;i<n;i++)
       // System.out.print(dp[i]+" ");
        return dp[n-1];
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		ar[i]=sc.nextInt();
		System.out.println(solve(ar,n,k));
		
	}
}
