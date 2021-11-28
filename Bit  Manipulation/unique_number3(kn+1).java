

import java.util.*;

class GFG {
    public static int solve(int arr[],int n,int k)
    {
        ArrayList<Integer> lst=new ArrayList<>();
        for(int i=0;i<32;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                int val=arr[j];
                if((arr[j]&1)!=0)
                c+=1;
                
                arr[j]=arr[j]>>1;
            }
            lst.add(c);
        }
      //  System.out.println(lst);
        String st="";
        String st2="";
        for(int i:lst)
        {
        int x=i%k;
        st=x+st;
        st2=st2+x;
        }
      //  System.out.println(st);
      //  System.out.println(st2);
    int ans=    Integer.parseInt(st,2);
    return ans;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
int ar[]=new int[k*n+1];
for(int i=0;i<(k*n+1);i++)
ar[i]=sc.nextInt();

System.out.println(solve(ar,ar.length,k));
	}
}
