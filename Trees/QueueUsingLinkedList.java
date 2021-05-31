 package Trees;

import StacknQueues.QueueEmptyException;

public class QueueUsingLinkedList<T> {

	private Node<T> front;
	private Node<T> rear;
	int size;
	
	
	public QueueUsingLinkedList() 
	{
		 front=null;
		 rear=null;
		 size=0;
	}
	int size() 
	{
		
		return this.size;
	}
	boolean isEmpty() throws QueueEmptyException
	{
		return (this.size()==0);
	}
	// enqueue me stack k jese agar new node ko purani node ke pahele rakhenge toh enqueue ki time complexiity o(1)
	//aayegi and dequeue ki time O(n) esliye esme new node ko purani node ke next me hi rakhenge //
	//kruili dequeue krte time puri ll travel krni padgi n-1 tak aur fir first elemnt milega jisko delete krna hai 
	T front()
	{
		T ans=front.data;
		return ans;
	}
	void enqueue(T value) //rear end pr hoyenge new add hamehsa
	{
		Node<T> newNode=new Node<T>(value);
		if(rear==null)//matlab ll agar khali hai ye phle element ke liye hai 
		{
			front=newNode;
			rear=newNode;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
		size++;
	}
	T dequeue() throws QueueEmptyException
	{
		if(size()==0)
		{
			throw new QueueEmptyException();
		}
		T temp=front.data;
		front=front.next;
		if(size==1) //last elemnet ke liye kyuki front to apne aa null ho jayega
		{
			rear=null;
		}
		size--;
		return temp;
		
	}
}
