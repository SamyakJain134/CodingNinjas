package LinkedList;

import java.util.Scanner;

public class FindingaNodeInLL {
	
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

	public static int FindingNode (Node<Integer> head , int n ) 
	{
		int pos=0,count=0;
		while(head!=null)
		{
			count++;
			if(head.data==n)
			{
				pos=count;
			}
			head=head.next;
		}
		
		
		return pos-1 ; // because count 1 se shuru hoga aur indexcing 0 se 
	}
	public static void main(String[] args) {
		Node<Integer> head =takeInput();
		System.out.println(FindingNode(head, 2));

	}

}
