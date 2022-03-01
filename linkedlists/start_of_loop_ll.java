public class Solution {
    public ListNode detectCycle(ListNode head) {
       
        
        if(head==null)
            return null;
        if(head.next==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
                break;
        }
        if(slow!=fast)
            return null;
        
        ListNode c=head;
        while(c!=slow)
        {
            slow=slow.next;
            c=c.next;
        }
        return c;
    }
}
