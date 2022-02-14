class Solution{
    static boolean is(String st)
    {
        int i=0;
        int j=st.length()-1;
        while(j>i)
        {
            if(st.charAt(i)!=st.charAt(j))
            return false;
            
            i++;
            j--;
        }
        return true;
    }
    static String longestPalin(String S){
        // code here
        String ans="";
        int max=0;
        int n=S.length();
        for(int i=0;i<n;i++)
        {
           for(int j=i+1;j<=n;j++)
           {
               String x=S.substring(i,j);
               //System
               if(is(x))
               {
                   if(x.length()>max)
                   {
                       max=x.length();
                       ans=x;
                   }
               }
           }
        }
        return ans;
    }
}
