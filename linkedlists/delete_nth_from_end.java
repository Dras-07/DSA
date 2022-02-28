class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     
        ListNode ans=new ListNode(0);
        
        ListNode fast=ans;
        ListNode slow=ans;
        ans.next=head;
        for(int i=1;i<=(n+1);i++)
            fast=fast.next;
        System.out.println(fast.val+" "+slow.val);
        
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        return ans.next;
    }
}
