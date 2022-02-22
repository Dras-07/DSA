// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    
    
    
    
    
    static long mergeSort(int l,int r,long arr[])
    {
        long c=0;
        long f=0;
        if(r>l)
        {
            int m=(l+r)/2;
          long p=mergeSort(l,m,arr);
          long q=mergeSort(m+1,r,arr);
          
           long left[]=new long[m-l+1];
        long right[]=new long[r-m];
        
          int k=l;
          int x=left.length;
          int y=right.length;
        for(int i=0;i<x;i++)
        {
            left[i]=arr[k++];
        }
        
        for(int j=0;j<y;j++)
        right[j]=arr[k++];
        
        k=l;
        
      
        int i=0;
        int j=0;
        while(i<x && j<y)
        {
            if(right[j]<left[i])
            {
                arr[k]=right[j];
                c=c+(left.length-i);
                j++;
                k++;
            }
            else
            {
                arr[k++]=left[i++];
            }
        }
        
        
        while(i<x)
        {
            arr[k++]=left[i++];
        }
        while(j<y)
        arr[k++]=right[j++];
        
         c=c+p+q; 
       //  System.out.println(p+" "+q);
         // long v= merge(l,r,m,arr);
        }
        
        return c;
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return mergeSort(0,arr.length-1,arr);
    }
}
