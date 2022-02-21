class Solution {
    public int majorityElement(int[] nums) {
        
        
        int x=nums[0];
        
        int c=1;
        
        
        for(int i=1;i<nums.length;i++)
        {
            int e=nums[i];
            if(x==nums[i])
                c++;
            else
            {
                c--;
            }
            
            
            if(c<0)
            {
                c=1;
                x=nums[i];
            }
        }
        return x;
    }
}
