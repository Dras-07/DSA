class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        
        
        int pre[]=new int[n];
        int suff[]=new int[n];
        
        pre[0]=nums[0];
        
        for(int i=1;i<n;i++)
            pre[i]=nums[i]+pre[i-1];
        
        suff[n-1]=nums[n-1];
        
        for(int i=n-2;i>=0;i--)
        {
            suff[i]=nums[i]+suff[i+1];
        }
        
        for(int i=0;i<n;i++)
        {
           // System.out.println(suff[i]+" "+pre[i]);
            if(suff[i]==pre[i])
                return i;
        }
        return -1;
    }
}
