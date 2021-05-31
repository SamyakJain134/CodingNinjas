package LinkedList;

import java.util.Scanner;

public class appendLastNToFirst {
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
public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		
        if (n==0 || head==null)  return head;
        
        Node<Integer> temp=head;
        
        int len=0; // to find length of linked list
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        
        int count=(len-n); // to find number of elements to be reversed or appended to first 
       
        int i=1;
        Node<Integer> curr=head;
        while(i<count ){
            i++;
            curr=curr.next;
              
        }
         Node<Integer> h2=curr.next;
          curr.next=null;
                   
          Node<Integer> tail=h2;
          
          while(tail!=null && tail.next!=null){
              
               tail=tail.next;  
          }
        
        
             tail.next=head;
        
        
        
        return  h2;
   
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


	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		Node<Integer> temp=appendLastNToFirst(head, 3);
		print(temp);

	}

}
