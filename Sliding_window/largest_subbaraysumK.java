class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int n, int K) {
        //Complete the function

HashMap<Integer,Integer> hm=new HashMap<>();
int max=0;
hm.put(0,-1);
int sum=0;
for(int i=0;i<n;i++)
{
    sum=sum+A[i];
    if(hm.containsKey(sum-K))
    {
        max=Math.max(max,i-hm.get(sum-K));
    }
  
  
  
  if(hm.containsKey(sum)==false)
  {
      hm.put(sum,i);
  }
}
return max;
    }
    
    
}


