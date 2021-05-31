package LinkedList;

import java.util.Scanner;

public class printIthNode {
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
	public static void printIthNode(Node<Integer> head, int i){
		
        int count = 0;
        
        
        if (head==null){
             System.out.println();
            return;
        }
        
        Node<Integer> temp = head;
        while(temp.next != null){
            count++;
            temp = temp.next;
            if (count==i){
            	System.out.println(temp.data);
            }
        }
	}

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		printIthNode(head,1);

	}

}
