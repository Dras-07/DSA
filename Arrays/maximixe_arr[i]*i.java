class Solution{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);
    int sum=0;
    for(int i=0;i<n;i++)
    sum+=i*arr[i];
    return sum;
    }   
}

