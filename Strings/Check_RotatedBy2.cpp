class Solution
{
    public:
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    bool check(string st1,string st2)
    {
        st2+=st2;
        int a=st2.find(st1);
       int b=
    }
    bool isRotated(string str1, string str2)
    {
        // Your code here
        int n=str1.size();
        if(str1.size()==1)
        {
            if(str1[0]==str2[0])
            return true;
            else
            return false;
        }
        if(n==2)
    {
        if(str1.find(str2)==0)
        return true;
        else
        
        return false;
    }
        
        
       
    return (check(str1,str2) || check(str2,str1));
    }

};
