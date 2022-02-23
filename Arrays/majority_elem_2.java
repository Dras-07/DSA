class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> lst=new ArrayList<>();
        int n=nums.length;
        int n1=Integer.MAX_VALUE;
        int n2=Integer.MIN_VALUE;
        
        int c1=0;
        int c2=0;
        
        
        for(int i:nums)
        {
            if(i==n1)
                c1++;
            else if(i==n2)
                c2++;
            else if(c1==0)
            {
                n1=i;
                c1=1;
            }
            else if(c2==0)
            {
                n2=i;
                c2=1;
            }
            else
            {
                c1--;
                c2--;
            }
            
        }
        
        c1=0;
        c2=0;
        for(int i:nums)
        {
            if(i==n1)
                c1++;
            if(i==n2)
                c2++;
        }
        
        if(c1>n/3)
            lst.add(n1);
        if(c2>n/3)
            lst.add(n2);
        
        return lst;
        }
         
}
