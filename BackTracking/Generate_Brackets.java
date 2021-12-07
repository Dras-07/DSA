 List<String> lst =new ArrayList<>();
    public void solve(String st,int n,int open,int closed)
    {
        if(st.length()==2*n)
        {
            lst.add(st);
        }
        
        if(open<n)
        {
            solve(st+"(",n,open+1,closed);
        }
        if(closed<open)
        {
            solve(st+")",n,open,closed+1);
        }
         
    }
    public List<String> generateParenthesis(int n) {
     solve("",n,0,0);
        Collections.sort(lst);
        return lst;
    }
}
