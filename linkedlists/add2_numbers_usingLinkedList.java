class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        

        ListNode ans=new ListNode(-1);
        ListNode t=ans;
        
       int sum=0;
        int carry=0;
        while(l1!=null && l2!=null)
        {
            int x=l1.val;
            int y=l2.val;
            int total=x+y+carry;
            carry=total/10;
            sum=total%10;
            ListNode add=new ListNode(sum);
            t.next=add;
            t=add;
            
            l1=l1.next;
            l2=l2.next;
        }
        
        while(l1!=null)
        {
             int x=l1.val;
          //  int y=l2.val;
            int total=x+carry;
            carry=total/10;
            sum=total%10;
            ListNode add=new ListNode(sum);
            t.next=add;
            t=add;
            
            l1=l1.next;
        }
        
        while(l2!=null)
        {
          //   int x=l1.val;
            int y=l2.val;
            int total=y+carry;
            carry=total/10;
            sum=total%10;
            ListNode add=new ListNode(sum);
            t.next=add;
            t=add;
            
            l2=l2.next;
        }
        if(carry>0)
        {
                ListNode add=new ListNode(carry);
            t.next=add;
            t=add;
        }
        return ans.next;
    }
}
