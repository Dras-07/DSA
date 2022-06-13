class Solution 
{
    public List<Integer> findAnagrams(String st, String f) 
    {
          List<Integer> lst=new ArrayList<>();
            HashMap<Character,Integer> hm=new HashMap<>();
        
        if(f.length()>st.length())
        {
           return lst;
        }
            int k=f.length();
System.out.println(k+" "+f);
           int n=st.length();
            for(int i=0;i<f.length();i++)
            {
                hm.put(f.charAt(i),hm.getOrDefault(f.charAt(i),0)+1);
            }
            HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
             for(int i=0;i<k;i++)
             {
              hm1.put(st.charAt(i),hm1.getOrDefault(st.charAt(i),0)+1);
             }

int c=0;
if(hm1.equals(hm))
lst.add(0);
             for(int i=0,j=k;j<n;j++,i++)
             {
                 char ch=st.charAt(i);
                 char ch1=st.charAt(j);
                 hm1.put(ch,hm1.getOrDefault(ch,0)-1);
                 hm1.put(ch1,hm1.getOrDefault(ch1,0)+1);
                 if(hm1.get(ch)==0)
                 hm1.remove(ch);
                 if(hm.equals(hm1))
                 lst.add(i+1);              
             }
        return lst;
        
        
    }
}
