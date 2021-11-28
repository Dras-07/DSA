class Solution
{
    public static int rbsm(int n)
    {
      int c=0;
      int m=1;
      while(n!=0)
      {
          if((n&m)!=0)
          return c;
          else
          {
              c++;
              n=n>>1;
          }
      }
      return c;
    }
    public static boolean pos(int k,int n)
    {
        int m=1;
        m=m<<k;
       //// System.out.println(m);
        if((m&n)==0)
        return false;
        else
        
        return true;
    }
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int x=0;
        for(int i:nums)
        x^=i;
        //System.out.println(x);
        int val=0;
        int k=rbsm(x);
      //  System.out.println(k+"asd ");
        for(int i:nums)
        {
            if(pos(k,i))
            val^=i;
        }
        int val1=0;
        for(int i:nums)
        {
            if(i!=val)
            val1^=i;
        }
        int ans[]=new int[2];
        ans[0]=val1;
        ans[1]=val;
        Arrays.sort(ans);
        return ans;
    }
}
