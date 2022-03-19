class Solution {
    static int canReach(int[] A, int N) {
        // code here
        
        int last=N-1;
        for(int i=N-1;i>=0;i--)
        {
            if(i+A[i]>=last)
            last=i;
        }
        
        if(last==0)
        return 1;
        else
        return 0;
       
    }
};
