// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
  
    public static void solve(int [][]m,int n,boolean visited[][],int x,int y,String z,ArrayList<String> lst)
    {
        
        if(x==n-1 && y==n-1)
        {
           // if(hm.contains(z)==false)
            lst.add(z);
            
            
           // hm.add(z);
            return;
        }
        if(x<0 || x>=n || y>=n || y<0 || visited[x][y]==true || m[x][y]==0)
        return;
        
        visited[x][y]=true;
        
          solve(m,n,visited,x+1,y,z+'D',lst);
         solve(m,n,visited,x-1,y,z+'U',lst);
          solve(m,n,visited,x,y+1,z+'R',lst);
           solve(m,n,visited,x,y-1,z+'L',lst);
         visited[x][y]=false;
           return;
        
        
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        
        
        boolean visited[][]=new boolean[n][n];
        ArrayList<String> lst=new ArrayList<String>();
         if(m[n-1][n-1]==0 || m[0][0]==0)
    {
        lst.add("-1");
        return lst;
    }
        solve(m,n,visited,0,0,"",lst);
        Collections.sort(lst);
        
        
        return lst;
    }
}
