import java.util.*;

class TestClass {

    public static int solve(int a,int b)
    {
        if(b==0)
        return a;
        else
        return solve(b,a%b);
    }
    public static int hexa(int n)
    {

        //HashMap<Integer,Character> hm=new HashMap<>();;
        int x=0;
        while(n>0)
{
    int d=n%16;
    x=x+d;
    n=n/16;

}
return x;
    }
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int c=0;
for(int i=l;i<=r;i++)
{
    int a=hexa(i);
    if(solve(a,i)>1)
    c++;

}
System.out.println(c);

        }

    }
}
