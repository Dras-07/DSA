class MinStack {

    /** initialize your data structure here. */
    
    int val;
    
    public MinStack() {
        this.val=val;
    }
        Stack<Integer> min_stack=new Stack<>();  
     Stack<Integer> s=new Stack<>();
     int m=Integer.MAX_VALUE;
    public void push(int val) {
        
       if(min_stack.size()==0 || val<=min_stack.peek())
           min_stack.push(val);
        
        s.push(val);
    }
    
    public void pop() {
        
        if(s.size()>0)
        {
            if(s.peek()<=min_stack.peek())
            {
                s.pop();
                min_stack.pop();
            }
            else
                s.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
