public class Solution {
    public int solve(int[] A, int B) {

int n=A.length;
        int pre[]=new int[n];
        int suff[]=new int[n];
pre[0]=A[0];
suff[n-1]=A[n-1];
        for(int i=1;i<n;i++)
        {
pre[i]=A[i]+pre[i-1];
        }
        for(int i=n-2;i>=0;i--)
        suff[i]=A[i]+suff[i+1];


int max=pre[B-1];
int j=n-1;
for(int i=(B-2);i<=0;i--)
{
    int sum=pre[i]+suff[j];
    max=Math.max(sum,max);
    j--;
}

j=0;
max=Math.max(max,suff[n-B]);
for(int i=n-B+1;i<n;i++)
{
    int sum=pre[j]+suff[i];
    max=Math.max(sum,max);
    j++;
}

return max;
    }
}
