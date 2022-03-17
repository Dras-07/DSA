class Solution {
    // Function to return a list containing the DFS traversal of the graph.
     ArrayList<Integer> lst=new ArrayList<>();
    public void dfs(int i,int V , ArrayList<ArrayList<Integer>> adj,HashSet<Integer> hm)
    {
      if(hm.size()==V)
      return;
      
      if(hm.contains(i))
      return;
      
      hm.add(i);
      for(Integer x:adj.get(i))
      {
          if(hm.contains(x)==false)
          {
              lst.add(x);
              dfs(x,V,adj,hm);
          }
      }
      return;
    }
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        HashSet<Integer> hm=new HashSet<>();
        lst.add(0);
        dfs(0,V,adj,hm);
        return lst;
        
        
    }
}
