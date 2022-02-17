  public class Pair{
        int p;
        int c;
        int m;
        public Pair(int p,int c ,int m)
        {
            this.p=p;
            this.c=c;
            this.m=m;
        }
    }
class Solution
{
  
   
    public void customSort (int phy[], int chem[], int math[], int N)
    {
    // your code here
        
      ArrayList<Pair> ans=new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            Pair x=new Pair(phy[i],chem[i],math[i]);
            ans.add(x);
        }
        Collections.sort(ans,(new Comparator<Pair>(){
            public int compare(Pair a,Pair b)
            {
                if(a.p==b.p)
                {
                    if(a.c==b.c)
                    {
                        return a.m-b.c;
                    }
                    else
                    {
                        return b.c-a.c;
                    }
                }
                else
                return a.p-b.p;
            }
        }));
        for(int i=0;i<N;i++)
        {
            Pair x=ans.get(i);
            phy[i]=x.p;
            chem[i]=x.c;
            math[i]=x.m;
        }
    }
}
