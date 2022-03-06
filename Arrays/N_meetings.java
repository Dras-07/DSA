class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    
    public static class Pair{
        int st;
        int en;
        Pair(int st,int en)
        {
            this.st=st;
            this.en=en;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        
        ArrayList<Pair> lst=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int a=start[i];
            int b=end[i];
            lst.add(new Pair(a,b));
        }
        Collections.sort(lst,new Comparator<Pair>(){
          public int compare(Pair a,Pair b)
           {
               return a.en-b.en;
           }
        });
        
        int dp[]=new int[n];
        dp[0]=1;
        
        for(int i=1;i<n;i++)
        {
            int last=-1;
            int low=0;
            int high=i-1;
            while(high>=low)
            {
                int mid=(high+low)/2;
                if(lst.get(mid).en<lst.get(i).st)
                {
                    last=mid;
                    low=mid+1;
                }
                else
                high=mid-1;
            }
            int inc=0;
           if(last!=-1)
           {
               inc=dp[last];
           }
           dp[i]=Math.max(inc+1,dp[i-1]);
        }
        return dp[n-1];
    }
}
