class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> stk=new Stack<>();
    	for(int i=0;i<n;i++)
    	stk.push(i);
    	
 
    
   while(stk.size()>=2)
   {
       int a=stk.pop();
       int b=stk.pop();
       if(M[a][b]==0)
       {
           stk.push(a);
       }
       else
       stk.push(b);
   }
    
    	int g=stk.peek();
    	for(int i=0;i<n;i++)
    	{
    	    if(i!=g)
    	    {
    	    if(M[i][g]==0 ||M[g][i]==1)
    	    return -1;
    	    }
    	}
    	return g;
  
    }
}
