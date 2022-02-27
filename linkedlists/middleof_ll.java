class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null)
     return null;
            ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
        fast=fast.next.next;
            slow=slow.next;
        }
        if(fast.next!=null)
        return slow.next;
        else
            return slow;
    }
}
