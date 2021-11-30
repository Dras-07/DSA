import java.util.*;
public class problem{
public static String ans(String st,int bit)
{
	String fin="";
	for(int i=0;i<st.length();i++)
	{
		if((bit&1)==1)
			fin=fin+st.charAt(i);
		bit=bit>>1;	
		
	}
	return fin;
}
	  public static void solve(String st)
	    {
		  ArrayList<String> lst=new ArrayList<>();
		  int n=st.length();
		  int x=(int)(Math.pow(2,n))-1;
		  for(int i=0;i<x;i++)
		  {
			  String bit=Integer.toBinaryString(i);
		lst.add(ans(st,i));
		  }
		  Collections.sort(lst);
		  System.out.println(lst);
			  return;
	    }
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			while(t-->0)
			{
			  
			    String st=sc.next();
			   solve(st);
			}
		}
}
