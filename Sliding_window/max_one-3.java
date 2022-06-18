class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;    
        int i=0;
        int j=0;
        int c=0;
        int max=0;
        while(i<n)
        {
            if(nums[i]==0)
                c++;          
              if(c==k)
                {
                   max=Math.max(i-j+1,max) ;
                }
            while(c>k && j<n)
            {
               if(nums[j]==0)
                   c--;
                
                j++;
            } 
            i++;
        }
         max=Math.max(i-j,max) ;
        return max;
    }
}
