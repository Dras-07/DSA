// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long ar[], int n, int k)
    {
     
     
     List<Long> q=new ArrayList<>();
             for(int i=0;i<k;i++)
        {
            if(ar[i]<0){
            q.add(ar[i]);
            }
        }
            
int g=0;
long ans[]=new long[n-k+1];


for(int i=0,j=k;j<ar.length;j++,i++){
//System.out.println(q);
    if(q.size()>0)
    {
        if(ar[i]<0)
        {
        long a=q.remove(0);
        ans[g++]=a;
        }
        else
        {
         
            ans[g++]=q.get(0);
        }


        if(ar[j]<0)
        q.add(ar[j]);
       
    }
    else
    {
      //  System.out.println(i+"o "+j);
      //  System.out.println(q);
      
      ans[g++]=0;
        if(ar[j]<0)
        {
            q.add(ar[j]);
            
        }
        
    }
}

if(q.size()>0)
{
    ans[g]=q.remove(0);
}
return ans;
     
        
    }
}
