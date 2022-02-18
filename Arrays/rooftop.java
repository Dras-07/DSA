class Solution
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        // Your code here
        
        int c=0;
        int max=0;
        int curr=A[0];
        
        for(int i=1;i<N;i++)
        {
            if(A[i]>curr)
            {
                c++;
                curr=A[i];
            }
            else
            {
                max=Math.max(max,c);
                c=0;
                curr=A[i];
            }
        }
        max=Math.max(max,c);
        return max;
    }
    
}
