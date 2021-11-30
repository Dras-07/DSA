class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==0 || right==0)
            return 0;
        int x=(int)(Math.log(left)/Math.log(2));
		  int y=(int)(Math.log(right)/Math.log(2));
		  if(x!=y)
			  return 0;
		  else
		  {
			  int c=1<<x;
			  return c+rangeBitwiseAnd(left-c,right-c);
		  }
    }
}
