class Solution
{
    //Function to merge the arrays.
    public static void insert(long arr2[],int m)
    {
        long key=arr2[0];
        
       int i=1;
       while(i<m && arr2[i]<key)
       {
           arr2[i-1]=arr2[i];
           i++;
       }
       arr2[i-1]=key;
       return;

    }
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i=0;
        int j=0;
        for(i=0;i<n;i++)
        {
            if(arr1[i]>arr2[0])
            {
                long t=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=t;
            }
            insert(arr2,m);
        }
    }
}
