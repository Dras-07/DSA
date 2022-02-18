// { Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int diff=r-l;
        int n=0;
        int v=0;
      n=m-l+1;
      v=r-m;
         int left[]=new int[n];
         int right[]=new int[v];
         
        for(int i=0;i<n;++i){
         left[i]=arr[l+i];
        // j++;
         }
         for(int i=0;i<v;++i)
         {
             right[i]=arr[m+1+i];
             //j++;
         }
         
      
      
           int  k=l;
         int i=0;
         int j=0;
         
         
         while(i<n && j<v)
         {
             if(right[j]<left[i])
             {
                 arr[k]=right[j];
                 k++;
                 j++;
             }
             else
             {
                 arr[k]=left[i];
                 k++;
                 i++;
             }
         }
         while(i<n)
         {
            arr[k]=left[i];
            i++;
            k++;
         }
         while(j<v)
         {
             arr[k]=right[j];
             j++;
             k++;
         }
      
         
    }
    void mergeSort(int arr[], int l, int r)
    {
if(r>l)
{
int mid=l+(r-l)/2;
mergeSort(arr,l,mid);
mergeSort(arr,mid+1,r);
merge(arr,l,mid,r);
}
//code here
    }
}
