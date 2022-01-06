import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] ar) {
int n=ar.length;
 
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            hm.put(ar[i],(i+1));
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            
            if(ar[i]!=(i+1))
            {
                int index=hm.get(i+1);
                int t=ar[index-1];
                int x=ar[i];
                ar[index-1]=ar[i];
                ar[i]=t;
                hm.put((i+1),(i+1));
                hm.put(x,(index));
                c++;
            }
           // int y=hm.get()
         

        }
        // for(int i:ar)
        // System.out.print(i+" ");
        // System.out.println(hm);
        return c;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
