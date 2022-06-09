// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> lst=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,0);
        hm.put(arr[0],1);
        for(int i=1;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i];
            hm.put(arr[i],i+1);
        }
      //  System.out.println(hm);
        for(int i=0;i<n;i++)
         {
             if(hm.containsKey(arr[i]-s))
             {
                 lst.add(hm.get(arr[i]-s)+1);
                 lst.add(i+1);
                 
                 return lst;
             }
         }
         
         lst.add(-1);
         return lst;
        
        
    }
}
