class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode prev=null;
         ListNode curr=head;
         ListNode age=curr.next;
        while(age!=null)
        {
            ListNode tem=curr;
            curr.next=prev;
            prev=curr;
            curr=age;
            age=age.next;
        }
        curr.next=prev;
        prev=curr;
        return prev;
    }
}
