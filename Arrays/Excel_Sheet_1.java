class Solution {
    public int titleToNumber(String st) {
        
        
        int val=1;
        
        
        int sum=0;
        int j=0;
        int g=0;
        int n=st.length();
        for(int i=n-1;i>=0;i--)
        {
            char ch=st.charAt(i);
            int pos=ch-'A'+1;
         g+=(int)Math.pow(26,j)*pos;
            j++;
            val=pos;
        }
        return g;
    }
}
