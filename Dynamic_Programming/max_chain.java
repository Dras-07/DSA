// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}

class Chainlength
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Pair pr[] = new Pair[n];
            int arr[] = new int[2*n];
            for(int i = 0; i < 2*n; i++)
            {
               arr[i] = sc.nextInt();
            }
            for(int i = 0, j = 0; i < 2*n-1 && j < n; i = i+2, j++)
            {
                pr[j] = new Pair(arr[i], arr[i+1]);
            }
            GfG g = new GfG();
            System.out.println(g.maxChainLength(pr, n));
        }
    }
}
// } Driver Code Ends




class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
  
  Arrays.sort(arr,new Comparator<Pair>(){
      public int compare(Pair a,Pair b)
      {
          if(a.y==b.y)
          return a.x-b.x;
          else
          return a.y-b.y;
      }
  });
// Arrays.sort(arr,(a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]); 
  int dp[]=new int[n];
  dp[0]=1;
  for(int i=1;i<n;i++)
  {
      Pair p=arr[i];
      int st0=p.x;
      int end0=p.y;
      int max=0;
      for(int j=i-1;j>=0;j--)
      {
          Pair q=arr[j];
          int st1=q.x;
          int end1=q.y;
          if(st0>end1)
          {
              max=Math.max(max,dp[j]);
          }
      }
      dp[i]=max+1;
  }
  int max=0;
   for(int i=0;i<n;i++){
   max=Math.max(max,dp[i]);
   }
  return max;
  
  }
}
