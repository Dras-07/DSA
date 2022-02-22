class Solution {
    public int missingNumber(int[] nums) {
        
        int n=nums.length;
        for(int i=0;i<n;i++)
            nums[i]++;
        int m=n-1;
       for(int i=0;i<n;i++)
       {
           int x=Math.abs(nums[i]);
           if(x<=n)
           {  
           x=Math.abs(x)-1;
           nums[x]=-nums[x];
           }
       }
        for(int i:nums)
            System.out.println(i);
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                return i;
            }
        }
        return n;
    }
}
