package LinkedList;

import java.util.Scanner;

public class DeleteiThelement {
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
	public static Node<Integer> deletenode (Node<Integer> head ,int pos)
	{
		if(head==null)
		{
			return head;
		}
		if(pos==0)
		{
			return head.next;
		}
		int count=0;
		Node<Integer> temp=head;
		while(temp!=null  &&  count<(pos-1))
		{
			temp=temp.next;
			count++;
		}
		if(temp==null||temp.next==null)
		{
			return head;
		}
		temp.next=temp.next.next;
		return head;
	}

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		Node<Integer> head2=deletenode(head,1);
		print(head2);
		
	}

}
