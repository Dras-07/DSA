class Solution {
    public void moveZeroes(int[] nums) {
       int last=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int t=nums[last];
                nums[last]=nums[i];
                nums[i]=t;
                last++;
            }
            
        }
        
    }
}
