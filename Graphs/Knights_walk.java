class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    
    class Pair{
        int x;
        int y;
        int dist;
        Pair(int x,int y,int dist)
        {
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
    }
    
    public boolean check(int x,int y,int N)
    {
        if(x<0 || y<0 ||y>=N || x>=N)
        return false;
        else
        return true;
    }
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        int x0=KnightPos[0]-1;
        int y0=KnightPos[1]-1;
        
        
        int x1=TargetPos[0]-1;
        int y1=TargetPos[1]-1;
        boolean visited[][]=new boolean[N][N];
        int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
        Queue<Pair> pq=new LinkedList<>();
        
        pq.add(new Pair(x0,y0,0));
        visited[x0][y0]=true;
        
        while(pq.size()>0)
        {
            Pair p=pq.poll();
            
            if(p.x==x1 && p.y==y1)
            {
                return p.dist;
            }
            else
            {
                int g=p.x;
                int h=p.y;
                int r=p.dist;
              for(int i=0;i<8;i++)
             {
                 int a=dx[i];
                 int b=dy[i];
                 if(check(g+a,h+b,N)==true && visited[a+g][b+h]==false)
                 {
                     visited[a+g][b+h]=true;
                     pq.add(new Pair(g+a,h+b,r+1));
                 }
             }
            }
        }
        return -1;
        
    }
}
