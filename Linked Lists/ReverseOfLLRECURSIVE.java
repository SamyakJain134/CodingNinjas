package LinkedList;

public class ReverseOfLLRECURSIVE extends LinkedListUse{
	 public static Node<Integer> reverseLLmethod1 (Node<Integer> head)
	 {
		 if(head==null || head.next==null)
		 {
			 return head;
		 }
		 Node<Integer> newHead= reverseLLmethod1(head.next);
		 head.next.next=head;
		 head.next=null;
		 return newHead;
		 //isko time complecity O(n) hai 
	 }
	 public static Node<Integer> reverseLLmethod2 (Node<Integer> head)
	 {
		 if(head==null || head.next==null)
		 {
			 return head;
		 }
		 Node<Integer> newHead= reverseLLmethod2(head.next); //Time Complexity=
		 //T(n)=T(n-1)+n-1
		 //solve karenge toh O(n2) aayei
		 Node<Integer> temp=newHead;
		 while(temp.next!=null)
		 {
			 temp=temp.next;
		 }
		 temp.next=head;
		 head.next=null;
		 return newHead;
	 }
	 //ek calss banyenge double node jisme head aur tail dono return karwayenge 
	 public static DoubleNode reverseLLbetter (Node<Integer> head)
	 {
		 if(head==null || head.next==null)
		 {
			 DoubleNode ans= new DoubleNode();
			 ans.head=head;
			 ans.tail=head;
			 return ans;
		 }
		 DoubleNode newHead= reverseLLbetter(head.next);
		 newHead.tail.next=head;
		 head.next=null;
		 
		 DoubleNode finalHEad = new DoubleNode();
		 finalHEad.head=newHead.head;
		 finalHEad.tail=head;
		 return finalHEad;
		 //isko time complecity O(n) hai 
	 }
	 public static Node<Integer> reverseLLmethod4 (Node<Integer> head)
	 {
		 if(head==null || head.next==null)
		 {
			 return head;
		 }
		 Node<Integer> newTail=head.next;
		 Node<Integer> newHead= reverseLLmethod4(head.next);
		 newTail.next=head;
		 head.next=null;
		 return newHead;
		 //isko time complecity O(n) hai 
	 }
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		Node<Integer> head2=reverseLLmethod1(head);
		DoubleNode head3=reverseLLbetter(head);
		Node<Integer> head4=reverseLLmethod2(head);
		Node<Integer> head5=reverseLLmethod4(head);
		//print(head2);
		print(head3.head);
		//print(head4);
		//print(head5);
	}

}
