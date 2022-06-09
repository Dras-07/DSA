class Solution {
    //Function to find transpose of a matrix.
    public void transpose(int arr[][], int n)
    {      
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }       
    }
   public void switch_matrix(int arr[][],int n)
   {
           int low=0;
           int high=n-1;
           while(low<high)
           {
               for(int i=0;i<n;i++)
               {
                   int t=arr[i][low];
                   arr[i][low]=arr[i][high];
                   arr[i][high]=t;
               }
               low++;
               high--;
           }
   }
    public void rotate(int[][] matrix) {
        
        int n=matrix.length;
        transpose(matrix,n);
        switch_matrix(matrix,n);
    }
}
