class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int max=0;
       // hm.put(arr[0],0);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(hm.containsKey(sum))
            {
                int x=hm.get(sum);
                int diff=Math.abs(i-x);
                max=Math.max(max,diff);
                // hm.put(sum,i);
            }
            else
            hm.put(sum,i);
        }
        return max;
    }
}
