class Solution
{
    
      public static class Pair{
        int start;
        int end;
        
        Pair(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        
       Arrays.sort(arr);
       Arrays.sort(dep);
        
        int i=1;
        int max=1;
        int j=0;
        int c=1;
     while(i<n && j<n)
        {
           if(arr[i]<=dep[j])
           {
               i++;
               c++;
           }
           else
           {
               c--;
               j++;
           }
            max=Math.max(c,max);
        }
        return max;
        
        
        
    }
    
}

