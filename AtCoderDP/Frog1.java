   
///Approach 1(tabulation)
import java.util.*;
    public class Main
    {
        
        public static int solve(int ar[],int n)
        {
            
        int dp[]=new int[n];
        
        dp[0]=0;
        dp[1]=Math.abs(ar[1]-ar[0]);
        for(int i=2;i<n;i++)
        {
            int x=dp[i-2]+Math.abs(ar[i-2]-ar[i]);
            int y=dp[i-1]+Math.abs(ar[i-1]-ar[i]);
            dp[i]=Math.min(x,y);
        }
        return dp[n-1];
        //https://www.ideserve.co.in/#trees
        }
    	public static void main(String[] args) {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt();
    		int ar[]=new int [n];
    		for(int i=0;i<n;i++)
    		ar[i]=sc.nextInt();
    		
    		System.out.println(solve(ar,n));
    	}
    }
/***************************************************************************************************************************************************************/
/***************************************************************************************************************************************************************/


//Approach 2 (memoization)
import java.util.*;
public class Main
{
    
    public static int solve(int ar[],int n,int dp[])
    {
    if(n==0)
    return 0;
    if(n==1)
    return Math.abs(ar[1]-ar[0]);
    
    if(dp[n]!=0)
    return dp[n];
    int x=Math.abs(ar[n]-ar[n-2])+solve(ar,n-2,dp);
    int y=Math.abs(ar[n]-ar[n-1])+solve(ar,n-1,dp);
    
    int z=Math.min(x,y);
    return dp[n]=z;
    
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int [n];
		for(int i=0;i<n;i++)
		ar[i]=sc.nextInt();
		int dp[]=new int[n];
		System.out.println(solve(ar,n-1,dp));
	}
}
