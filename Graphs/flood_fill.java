class Solution {
    
    public void solve(int [][]image,int x,int y,int newColor,boolean visited[][],int n,int m,int val)
    {
        if(x>=n || y>=m || x<0 || y<0 || image[x][y]!=val || visited[x][y]==true)
            return ;
        
        visited[x][y]=true;
        
        image[x][y]=newColor;
        solve(image,x+1,y,newColor,visited,n,m,val);
         solve(image,x-1,y,newColor,visited,n,m, val);
         solve(image,x,y+1,newColor,visited,n,m, val);
         solve(image,x,y-1,newColor,visited,n,m, val);
        visited[x][y]=false;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n=image.length;
        int m=image[0].length;
        int val=image[sr][sc];
        boolean v[][]=new boolean[n][m];
        solve(image,sr,sc,newColor,v,n,m,val);
        return image;
    }
}
