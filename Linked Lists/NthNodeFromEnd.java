package LinkedList;

import java.util.Scanner;

public class NthNodeFromEnd {
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
	
	public static int nThNode(Node<Integer> head, int pos)
	{
		if(head==null)
		{
			return head.data;
		}
		Node<Integer> first=head;
		for(int i=0;i<pos;i++)
		{
			first=first.next;
		}
		Node<Integer> second =head;
		while(first!=null)
		{
			second=second.next;
			first=first.next;
		}
		return second.data;
	}

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		//Node<Integer> head2=midpoint(head);
		System.out.println(nThNode(head, 3));

	}

}
