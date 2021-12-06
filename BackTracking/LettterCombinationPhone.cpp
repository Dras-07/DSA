class Solution {
public:
       vector <string> result;
    void solve(int index,string digits,vector<string> maps,string st)
{
        //cout<<st<<endl;
        //cout<<index<<endl;
    if(st.length()==digits.length())
    {
     cout<<st<<endl;   
        result.push_back(st);
        return;
    }
        int d=digits[index]-'0';
      ///  cout<<d<<endl;
        string val=maps[d];
 //  string val=maps[]
      //  cout<<val<<endl;
    int x=val.length();
    for(int i=0;i<x;i++)
    {
    solve(index+1,digits,maps,st+val[i]);
    }
}
    vector<string> letterCombinations(string digits) {
      vector <string> map={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
 
    solve(0,digits,map,"");
    return result; 
    }
};
