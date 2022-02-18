class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min=arr[i];
        int index=i;
        for(int j=i+1;j<arr.length;j++)
        {
         if(arr[j]<min)
         {
             min=arr[j];
             index=j;
         }
        }
        
       return index;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n;i++)
{
   int index= select(arr,i);
     int t=arr[index];
        arr[index]=arr[i];
        arr[i]=t;
}
	}	
}
