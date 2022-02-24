class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++)        
        {
            int x=nums[i];
            if(hm.containsKey(target-x))
            {
                int y=target-x;     
                    a[0]=hm.get(y);
                    a[1]=i;
                    return a;
            }              
            else
                hm.put(x,i);
        }
      //  int f[]=new int[2];
        return a;
   }
}
