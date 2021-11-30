#include<bits/stdc++.h>
using namespace std;

int matrixScore(vector<vector<int>> grid) {
    int n=grid.size();
    int m=grid[0].size();
    for(int i=0;i<n;i++)
    {
        if(grid[i][0]==0)
        {
            for(int j=0;j<m;j++)
            {
            if(grid[i][j]==0)
            grid[i][j]=1;
            else
            grid[i][j]=0;
            }
        }
    }
    for(int j=0;j<m;j++)
    {
        int c0=0;
        int c1=0;
        for(int i=0;i<n;i++)
        {
            if(grid[i][j]==0)
            c0++;
            else
            c1++;
            
        }
        if(c0>c1)
        {
            for(int i=0;i<n;i++)
            {
               if(grid[i][j]==1)
               grid[i][j]=0;
               else
               grid[i][j]=1;
            }
        }
        
    }
    
    
    for(int i=0;i<n;i++)
    for(int j=0;j<m;j++)
    cout<<grid[i][j]<<endl;
    int sum=0;
    for(int i=0;i<n;i++){
     int c=0;  
     int k=0;
    for(int j=m-1;j>=0;j--)
    {
        c=c+(grid[i][j]*(1<<k));
        k++;
    }
    sum=sum+c;
    }
    return sum;
    
}
