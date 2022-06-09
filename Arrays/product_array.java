
class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
               //int n=nums.length;
        long ans[]=new long[n];
        long p=1;
        ans[0]=1;
        for(int i=1;i<n;i++)
        {
            ans[i]=nums[i-1]*p;
            p=p*nums[i-1];
        }
        
       // p=nums[n-1];
        p=1;
        for(int i=n-2;i>=0;i--)
        {
            p=p*nums[i+1];
            ans[i]=ans[i]*p;

        }
        
        
        return ans;
	} 
} 
