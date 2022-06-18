class Solution {
    public int lengthOfLongestSubstring(String st) {
        int n=st.length();
        
             HashMap<Character,Integer> hm=new HashMap<>();
     int i=0;
     int j=0;
     int max=0;
     while(i<n)
     {
        char ch=st.charAt(i);
        if(hm.containsKey(ch))
        {
            max=Math.max(max,i-j);
            //System.out.println(j+" "+i);
            j=Math.max(hm.get(ch)+1,j);
            hm.put(ch,i);
        }
        else
        {
            hm.put(ch,i);
        }

        i++;
     }
        System.out.println(j+" "+n);
max=Math.max(max,n-j);
     return max;
        
    }
}
