package LinkedList;

import java.util.Scanner;

public class PrintReverseLL {
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
	public static void PrintReverse(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		PrintReverse(head.next);
		System.out.print(head.data+" ");
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method st
		Node<Integer> head=takeInput();
		PrintReverse(head);
	}

}
