class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        int s=0;
        hm.put(0,-1);
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
           s++;
            else
                s--;

            if(hm.containsKey(s))
            {
                max=Math.max(max,i-hm.get(s));
            }
            else
            {
                hm.put(s,i);
            }
        }
        return max;
    }
}
