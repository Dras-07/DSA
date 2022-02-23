class Solution {
    static int mod=1000000007;
    public double myPow(double x, int n) {
          //  System.out.println(n+" "+(n%2));
        
      if(n<0)
          return 1/x * myPow(1/x,-(n+1));
     if(n==0)
         return 1;
        if(n==2)
            return x*x;
        if(n%2==0)
            return myPow(myPow(x,n/2),2);
        else
            return x*myPow(myPow(x,n/2),2);
    }
}
