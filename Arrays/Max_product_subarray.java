// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
   
    long maxProduct(int[] arr, int n) {
        // code here
         long max=arr[0];
    long min=arr[0];
       long umax=arr[0];
        for(int i=1;i<n;i++)
        {
            long first=min*arr[i];
            long sec=max*arr[i];
            long third=arr[i];
            max=Math.max(Math.max(first,sec),third);
            min=Math.min(Math.min(first,sec),third);
            umax=Math.max(max,umax);
        }
        return umax;
    }
}
