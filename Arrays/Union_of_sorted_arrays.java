class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        HashSet<Integer> hm=new HashSet<>();
        ArrayList<Integer> lst=new ArrayList<>();
       
       
       
      int i=0;
      int j=0;
      while(i<n && j<m)
      {
          if(arr1[i]<arr2[j])
          {
              if(hm.contains(arr1[i])==false)
              {
                  lst.add(arr1[i]);
                  hm.add(arr1[i]);
              }
              i++;
          }
          else
          {
              if(hm.contains(arr2[j])==false)
              {
                  lst.add(arr2[j]);
                  hm.add(arr2[j]);
              }
              j++;
          }
          
        
      }
      
      
      while(i<n)
      {
          if(hm.contains(arr1[i])==false)
          {
              hm.add(arr1[i]);
              lst.add(arr1[i]);
          }
          i++;
      }
    
      while(j<m)
      {
          if(hm.contains(arr2[j])==false)
          {
              hm.add(arr2[j]);
              lst.add(arr2[j]);
          }
          j++;
      }
      return lst;
    }
}
