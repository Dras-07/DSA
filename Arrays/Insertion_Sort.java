class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int val=arr[i];
       int index=i;
       int j=i-1;
       while(j>=0 && arr[j]>val)
       {
           int t=arr[j];
           arr[j]=arr[index];
           arr[index]=t;
           j--;
           index--;
       }
       
       
       
       
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++)
      insert(arr,i);
  }
}
