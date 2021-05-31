package LinkedList;

import java.util.Scanner;

public class LengthofLL {
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
	public static int length(Node<Integer> head){
		//Your code goes here\
        if(head==null)
        {
            return 0;
        }
        Node<Integer> temp=head;
        int count=1;
        while(temp.next!=null)
        {
            count++;
            temp=temp.next;
    	}
        return count;
	}
	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		int l=length(head);
		System.out.println(l);

	}

}
