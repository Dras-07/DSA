class Solution {
    
    public int solve(int nums[],int target,int index)
    {
        if(index==nums.length)
        {
            if(target==0)
                return 1;
            else
                return 0;
        }
        
        int ways=0;
        ways+=solve(nums,target-nums[index],index+1);
        ways+=solve(nums,target+nums[index],index+1);
        return ways;
    }
    public int findTargetSumWays(int[] nums, int target) {
     return solve(nums,target,0);   
    }
}
