package StacknQueues;




//arrays ke case me generics use nhi kar paa rahe the 
//Size ka chakkr nahi h LL me 








public class StackUsingLL<T> {
	private Node<T> head; // ll ke case me head se hi insertion and head se hi removal taki time complexity kamm rahe 
	private int size;

	public StackUsingLL() {
		head=null;
		size=0;
		 //nahi bhi likhte toh chalta 
		// by default non primitives are initialized to zeroi
		//by default primitive integer zero se initialize hota hai  
	}
	int size()
	{
		return this.size;
	}
	T top() throws StackEmptyException
	{
		if(this.head==null)
		{
			//return -1;
			throw new StackEmptyException();
		}
		return this.head.data;
		
	}
	boolean isEmpty()
	{
		return (this.size()==0);
	}
	public void push(T element)
	{
		Node<T> newNode=new Node<T>(element);
		if(this.head==null)
		{
			this.head=newNode;
		}
		else
		{
			newNode.next=this.head;
			this.head=newNode;
		}
		this.size++;
	}
	public T pop() throws StackEmptyException
	{
		if(this.head==null)
		{
			//return -1;
			throw new StackEmptyException();
		}
		T ans=this.head.data;
		this.head=this.head.next;
		this.size=this.size-1;
		return ans; 
		
	}
	
}
























