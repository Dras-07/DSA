import java.util.*;



class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
       int n=s.nextInt();
      // int ar[][]=new int[n][2];
       int c=0;
       for(int i=0;i<n;i++)
       {
           long w=s.nextLong();
           long h=s.nextLong();

           if(w>h)
{
           double v=(double)w/(double)h;
          // System.out.println(v);
           if(v>=1.6 && v<=1.7)
           c++;
}
else
{
     double v=(double)h/(double)w;
          // System.out.println(v);
           if(v>=1.6 && v<=1.7)
           c++;
}

       }
       System.out.println(c);



    }
}
