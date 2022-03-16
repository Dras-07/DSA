class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> stk=new Stack<>();
        
        long g[]=new long[n];
        g[n-1]=-1;
        
        stk.push(arr[n-1]);
        
        for(int i=n-2;i>=0;i--)
        {
            while(stk.size()>0 && stk.peek()<=arr[i])
            {
                stk.pop();
            }
            if(stk.size()==0)
            g[i]=-1;
            else
            g[i]=stk.peek();
            stk.push(arr[i]);
        }
        return g;
    } 
}
