
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{

	public static boolean checkcol(int ar[][],int i,int j,int n)
	{
		for(int k=0;k<n;k++)
		{
			if(ar[k][j]==1)
			return false;
		}
		return true;
	}
	public static boolean checkdiag(int ar[][],int i,int j,int n)
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
	public static boolean check(int ar[][],int i,int j,int n)
	{
		if(checkcol(ar,i,j,n) && checkdiag(ar,i,j,n))
		{
			return true;
		}
		else
		return false;
	}
	public static boolean solve(int ar[][],int n,int i)
	{
       
    if(i==n){
	for(int k=0;k<n;k++){
	for(int j=0;j<n;j++)
	{
      System.out.print(ar[k][j]+" ");
	}
	System.out.println();
	}
	return true;
	}

	   for(int j=0;j<n;j++)
	   {
		   if(check(ar,i,j,n))
		   {
			   ar[i][j]=1;
			boolean ans=solve(ar,n,i+1);
			if(ans==true)
			return true;
			else
			{
				ar[i][j]=0;
			}
		   }
	   }
	   return false;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ar[][]=new int[n][n];
boolean fin=solve(ar,n,0);
		
	}
}
