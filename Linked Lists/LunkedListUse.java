package LinkedList;

public class LunkedListUse {
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		System.out.println("Function wala call");
		while(head != null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
		System.out.println("Function wala call me second wala print krne k lie");
		head=temp;
		while(head != null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void increment(Node<Integer> head){
	    Node<Integer> temp = head;
	    while(temp != null){
	        temp.data++;
	        temp = temp.next;
	    }
	}
	public static void main(String[] args) {
		
		Node<Integer> node1=new Node<Integer>(10);
		//System.out.println(node1.data);
		//System.out.println(node1.next);
		Node<Integer> node2=new Node<Integer>(20);
		node1.next=node2;
		Node<Integer> node3=new Node<Integer>(30);
		node2.next=node3;
		Node<Integer> head=node1;
		increment(head);
		print(head);
		System.out.println();
		System.out.println("while loop wala print ");
		while(head != null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
		
	}

}
