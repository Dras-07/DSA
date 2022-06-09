class Solution {
    public int maxAscendingSum(int[] nums) {
     
        
       // int max=1;
        int c=1;
        int sum=nums[0];
        int prev=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>prev)
            {
                sum=sum+nums[i];
                prev=nums[i];
            }
            
            else
            {
                max=Math.max(sum,max);
                prev=nums[i];
                sum=nums[i];
            }
        }
        max=Math.max(sum,max);
        
        return max;
    }
}
