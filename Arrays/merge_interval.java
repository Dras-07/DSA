class Solution {
    
    public class Pair{
        int start;
        int end;
        
        Pair(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }
    public int[][] merge(int[][] intervals) {
        
        ArrayList<Pair> ans=new ArrayList<>();
        
        for(int i=0;i<intervals.length;i++)
        {
            ans.add(new Pair(intervals[i][0],intervals[i][1]));
        }
        Collections.sort(ans,new Comparator<Pair>(){
           public int compare(Pair a,Pair b){
           return a.start-b.start;
           } 
        });
// for(int i=0;i<ans.size();i++)
// {
//     System.out.println(ans.get(i).start+" "+ans.get(i).end);
// }        
        ArrayList<Pair> lst =new ArrayList<>();
       Pair a=ans.get(0);
        int s=a.start;
        int e=a.end;
        //System.out.println(" sad="+s);
        
        for(int i=1;i<ans.size();i++)
        {
            Pair x=ans.get(i);
            int ns=x.start;
            int ne=x.end;
            
            
            if(ns<=e)
            {
                e=Math.max(ne,e);
            }
            else
            {
                lst.add(new Pair(s,e));
                s=ns;
                e=ne;
            }
        }
         lst.add(new Pair(s,e));
 int fin[][]=new int[lst.size()][2];       
for(int i=0;i<lst.size();i++)
{
    fin[i][0]=lst.get(i).start;
    fin[i][1]=lst.get(i).end;
   // System.out.println(lst.get(i).start+" "+lst.get(i).end);
}
            
    
        return fin;
            
            
    }
}
