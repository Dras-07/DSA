class Solution {
    public int solve(HashSet<Integer> hm,int x)
    {
        int c=1;
        for(int i=x+1;i<=100000;i++)
        {
            if(hm.contains(i))
                c++;
            else
                return c;
        }
        return c;
    }
    public int longestConsecutive(int[] nums) {
        
        
        HashMap<Integer,Boolean> hm=new HashMap<>();
        HashSet<Integer> hm1=new HashSet<>();
        for(int i:nums)
        {
            hm1.add(i);
        }
        for(int i:nums)
        {
            if(hm1.contains(i-1))
            {
                hm.put(i,false);
            }
            else
            {
                hm.put(i,true);
            }
        }
        int max=0;
        for(Integer x:hm.keySet())
        {
            if(hm.get(x)==true)
            {
                int d=solve(hm1,x);
                max=Math.max(d,max);
            }
        }
        return max;
    }
}
