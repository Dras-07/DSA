class Solution {
    
    List<String> lst=new ArrayList<String> ();
    public void solve(String S,String st,HashSet<Integer> hm)
    {
        if(hm.size()==S.length())
        {
            lst.add(st);
            return;
        }
        for(int i=0;i<S.length();i++)
        {
            if(hm.contains(i)==false){
            hm.add(i);
            solve(S,st+S.charAt(i),hm);
            hm.remove(i);
            }
        }
    }
    public List<String> find_permutation(String S) {
        // Code here
        HashSet<Integer> hm=new HashSet<>();
        solve(S,"",hm);
        Collections.sort(lst);
        return lst;
        
    }
}
