package LinkedList;

import java.util.Scanner;

public class MergeTwoSortedArrays {
	private static final int Integer = 0;

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

	public static Node<Integer> merge(Node<Integer> head1 , Node<Integer> head2)
	{
		if(head1==null)
		{
			return head2;
		}
		if(head2==null)
		{
			return head1;
		}
		Node<Integer> newHead=null;
		Node<Integer> newTail=null;
		
		if(head1.data<head2.data)
		{
			newHead=head1;
			newTail=head1;
			head1=head1.next;
		}
		else
		{
			newHead=head2;
			newTail=head2;
			head2=head2.next;
		}
		
		while(head1 !=null && head2 != null)
		{
			if(head1.data<head2.data)
			{
				newTail.next=head1;
				newTail=newTail.next;
				head1=head1.next;
			}
			else
			{
				newTail.next=head2;
				newTail=newTail.next;
				head2=head2.next;
			}
		}
		if(head1 != null)
		{
			newTail.next=head1;
		}
		if(head2 != null)
		{
			newTail.next=head2;
		}
		return newHead;
	}
	
	

	
	
	public static void main(String[] args) {
		Node<Integer> head1=takeInput();
		Node<Integer> head2=takeInput();
		Node<Integer> mainHead;
		mainHead=merge(head1, head2);
		print(mainHead);
	}

}
