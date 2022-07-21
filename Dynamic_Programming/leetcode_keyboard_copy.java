import java.util.*;

public class keyboards{

    public static int solve(Integer dp[],int n,int copied,int len)
    {
        
        if(len>n)
        return 0;
        
        if(len==n)
        return 1;

        if(dp[len]!=null)
return dp[len];
        int a=solve(dp,n,copied,len+copied)+1;
        int b=solve(dp,n,len+copied,len+copied)+1;


        return dp[len]=Math.min(a,b);
        
    }
    public static void main(String args[]) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer dp[]=new Integer[n];
        System.out.println(solve(dp,n,1,1));
    }
}