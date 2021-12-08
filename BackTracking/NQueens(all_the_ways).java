class Solution {
    
    
    public  boolean checkcol(int ar[][],int i,int j,int n)
	{
		for(int k=0;k<n;k++)
		{
			if(ar[k][j]==1)
			return false;
		}
		return true;
	}
	public boolean checkdiag(int ar[][],int i,int j,int n)
	{
		
	   int x=i;
	   int y=j;
	  while(x>=0 && y>=0)
	  {
		  if(ar[x][y]==1)
		  return false;

		  x--;
		  y--;
	  }
	  x=i;
	  y=j;
	  while(x>=0 && y<n)
	  {
		  if(ar[x][y]==1)
		  return false;

		  y++;
		  x--;
	  }
	  return true;
	}
    	public  boolean check(int ar[][],int i,int j,int n)
	{
		if(checkcol(ar,i,j,n) && checkdiag(ar,i,j,n))
		{
			return true;
		}
		else
		return false;
	}
    List<List<String>> lst=new ArrayList<>();
    public int solve(int ar[][],int i,int n)
    {
        if(i==n)
        {
            List<String> res=new ArrayList<>();
            for(int k=0;k<n;k++)
            {
                String st="";
                for(int z=0;z<n;z++)
                {
                    if(ar[k][z]==1)
                        st=st+"Q";
                    else
                        st=st+".";
                }
                res.add(st);
            }
            lst.add(res);
            return 1;
        }
        
        
        int ways=0;
        for(int j=0;j<n;j++)
        {
            if(check(ar,i,j,n))
            {
                ar[i][j]=1;
                ways+=solve(ar,i+1,n);
                ar[i][j]=0;
            }
        }
        return ways;
    }
    public List<List<String>> solveNQueens(int n) {
        int ar[][]=new int[n][n];
        int val=solve(ar,0,n);
      System.out.println("total ways="+val);
        return lst;
    }
}
