import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {    
        Scanner sc = new Scanner(System.in);
           int x=sc.nextInt();
          int y=sc.nextInt();
           int s=sc.nextInt();
           int t=sc.nextInt();

           int c=0;

        for(int i=(x+s);i>=x;i--)
        {
            for(int j=(y+s);j>=y;j--)
            {
                if(i+j<=t)
                c++;
            }
        }
        System.out.println(c);
        
       

    }
}
