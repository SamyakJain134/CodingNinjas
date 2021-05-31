package LinkedList;

public class JoinTwoLL {
	public static Node<Integer> joinTheLists(Node<Integer> head1, Node<Integer> head2)
    {
           if(head1==null)
           {
               return head2;
               
           }
           if(head2==null)
           {
               return head1;
           }
           Node<Integer> temp=head1;
           while(temp.next!=null)
           {
               temp=temp.next;
               
           }
           temp.next=head2;
           return head1;
    }
}
