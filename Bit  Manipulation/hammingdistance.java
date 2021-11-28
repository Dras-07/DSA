class Solution {
    public int hammingDistance(int x, int y) {
        int c=0;
        for(int i=0;i<=32;i++)
        {
            int val1=x&1;
            int val2=y&1;
            if((val1==0 && val2!=0) || (val1!=0 && val2==0))
                c++;
            
            x=x>>1;
            y=y>>1;
                
        }
        return c;
        
    }
}
