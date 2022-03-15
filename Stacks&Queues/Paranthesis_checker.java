class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack <Character> stk=new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if(ch==']')
            {
                if(stk.size()==0 || stk.peek()!='[')
                {
                    return false;
                }
                else
                stk.pop();
            }
            else if(ch=='}')
            {
                if(stk.size()==0 || stk.peek()!='{')
                return false;
                else
                stk.pop();
            }
            else if(ch==')')
            {
                 if(stk.size()==0 || stk.peek()!='(')
                return false;
                else
                stk.pop();
            }
            else
            {
                stk.push(ch);
            }
        }
        if(stk.size()!=0)
        return false;
        else
        return true;
    }
}
