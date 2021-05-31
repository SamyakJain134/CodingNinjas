package LinkedList;

import java.util.Scanner;

public class MergeSortLL {
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
	public static Node<Integer> midpoint(Node<Integer> head)
	{
		if(head==null||head.next==null)
		{
			return head ;
		}
		Node<Integer> slow=head;
		Node<Integer> fast=head.next;
		
		while(fast !=null && fast.next !=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	public static Node<Integer> mergesort (Node<Integer> head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		//midpoint find karenge upar function se aur fir list ko 2 parts me divide 
		Node<Integer>mid= midpoint(head);
		
		Node<Integer> half1=head;
		Node<Integer> half2= mid.next;
		mid.next=null;
		
		Node<Integer> newHead1=mergesort(half1);
		Node<Integer> newHead2=mergesort(half2);
		
		
		Node<Integer> finalHead=merge(newHead1, newHead2);
		return finalHead;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//phle slpit krenge twoi parts me ll ko
		//recursively sort karenge two parts usking merge sort 
		Node<Integer> head=takeInput();
		Node<Integer> head2 =mergesort(head);
		print(head2);

	}

}
