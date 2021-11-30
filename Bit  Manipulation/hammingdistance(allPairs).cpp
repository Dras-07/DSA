#include<bits/stdc++.h>
using namespace std;
int hammer(int a,int b)
{
    int val=a^b;
    int c=0;
    while(val>0)
    {
        int rbsm=val&-val;
        val=val-rbsm;
        c++;
    }
    return c;
}
int totalHammingDistance(vector<int> nums) {
    int c=0;
    for(int i=0;i<nums.size();i++)
    {
        for(int j=i+1;j<nums.size();j++)
        {
            int val=hammer(nums[i],nums[j]);
            c=c+val;
        }
    }
    return c;
}
