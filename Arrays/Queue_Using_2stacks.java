class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    if(input.size()==0)
	    return -1;
	    while(input.size()>1)
	    {
	        int a=input.pop();
	        output.push(a);
	        
	    }
	    int x=input.pop();
	    while(output.size()>0)
	    {
	        int a=output.pop();
	        input.push(a);
	    }
	    return x;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here
	    input.push(x);
    }
}

