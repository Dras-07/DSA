class Complete{
    
   
    // Function for finding maximum and value pair
    static long calc(long n)
    {
        if(n<=1)
        return 0;
        
        return (n*(n-1))/2;
    }
    public static long calculate (int arr[], int n) {
        //Complete the function
        Arrays.sort(arr);
        int pre=-1;
        long c=0;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            if(pre==arr[i])
            {
                c++;
                pre=arr[i];
            }
            else
            {
                sum=sum+calc(c);
                c=1;
                pre=arr[i];
            }
        }
        sum=sum+calc(c);
        return sum;
    }
    
    
}
