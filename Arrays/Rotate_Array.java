class Solution {
    public void rotate(int[] nums, int z) {
        int n=nums.length;
        int ans[]=new int[n];
     
        
        z=z%n;
        
        int k=0;
        for(int i=(n-z);i<n;i++)
        {     
            ans[k]=nums[i];
                k++;
        }
        
        for(int i=0;i<(n-z);i++)
        {
            ans[k]=nums[i];
            k++;
        }
        for(int i=0;i<n;i++)
            nums[i]=ans[i];
    }
}
