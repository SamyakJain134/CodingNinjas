package LinkedList;

import java.util.Scanner;

public class LinkedListUse {
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
	public static void Insert(Node<Integer> head,int data, int pos)
	{
		Node<Integer> newNode=new Node<Integer>(data);
		int i=0;
		Node<Integer>temp=head;
		while(i<pos-1)
		{
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next; //to join new node with previous node
		temp.next=newNode;
		
	}
	//Insert at end
	public static Node<Integer> InsertatEnd(Node<Integer> head,int data)
	{
		Node<Integer> newNode=new Node<Integer>(data);
		if(head==null)
		{	
			return newNode;
		}
		Node<Integer>temp=head;
		while(temp!=null)
		{
			temp=temp.next;
			temp.next=newNode;
			newNode.next=null;
		}
		return head;
		
	}
	
	

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		Insert(head,80,3);
		print(head);

	}

}
