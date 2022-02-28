// { Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}


class MergeLists
{
    Node head;



  /* Function to print linked list */
   public static void printList(Node head)
    {
        
        while (head!= null)
        {
           System.out.print(head.data+" ");
           head = head.next;
        }  
        System.out.println();
    }
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			Node head1 = new Node(sc.nextInt());
            Node tail1 = head1;
            for(int i=0; i<n1-1; i++)
            {
                tail1.next = new Node(sc.nextInt());
                tail1 = tail1.next;
            }
			Node head2 = new Node(sc.nextInt());
            Node tail2 = head2;
            for(int i=0; i<n2-1; i++)
            {
                tail2.next = new Node(sc.nextInt());
                tail2 = tail2.next;
            }
			
			LinkedList obj = new LinkedList();
			Node head = obj.sortedMerge(head1,head2);
			printList(head);
			
			t--;
			
         }
    }
}
// } Driver Code Ends


/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
    Node l1=head1;
    Node l2=head2;
    
    if(l1.data>l2.data)
    {
        Node t=l1;
        l1=l2;
        l2=t;
    }
    Node fin=l1;
    while(l1!=null && l2!= null)
    {
        Node ans=null;
        if(l1.next!=null)
        {
            if(l1.next.data<=l2.data)
            {
                Node x=l1.next;
                l1.next=x;
                l1=x;
            }
            else
            {
                Node v=l1.next;
                l1.next=l2;
                l1=v;
            }
        }
        else
        {
          l1.next=l2;
          l1=null;
        }
        
    if(l1!=null && l2!=null && l1.data>l2.data)
    {
        Node t=l1;
        l1=l2;
        l2=t;
    }
    }
    return fin;
   } 
}
