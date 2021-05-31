package LinkedList;

import java.util.Scanner;

public class RemoveDuplicatesfromLL {
	public static Node<Integer> takeInput()
	{
		Node<Integer> head=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data != -1)
		{
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null)
			{
				head=newNode;
			}
			else
			{
				Node<Integer> temp= head;
				while(temp.next!=null)
				{
					temp=temp.next;
					//jese hi last node par pahuch gai
				}
				//yahan par new node latest wali ka address daal denge
				temp.next=newNode;
				
			}
			data=s.nextInt();
		}
		return head;
	}
	public static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.data+"  ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> RemoveDuplicates (Node<Integer> head)
	{
		if(head==null||head.next==null)
		{
			return head;
			
		}
		Node<Integer> temp=head;
		while(temp.next!=null)
		{
			if(temp.data.equals(temp.next.data))
			{
				temp.next=temp.next.next;
			}
			else
				temp=temp.next;
		}
		return head;
		
		
	}
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		Node<Integer> head2=RemoveDuplicates(head);
		print(head2);

	}

}
