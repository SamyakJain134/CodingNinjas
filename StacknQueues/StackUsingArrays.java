package StacknQueues;

public class StackUsingArrays {
	private int data[];
	private int top; // it is the index of stack
	
	public StackUsingArrays() 
	{
		data=new int[10];
		top=-1;
	}
	public StackUsingArrays(int capacity) 
	{
		data=new int[capacity];
		top=-1;
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
		//time complexity=O(1)
	}
	public int size()
	{
		return top+1;
		//time complexity=O(1) 
	}
	public int top() throws StackEmptyException
	{
		if(size()==0)
		{
			//stack empyty exception 
			StackEmptyException e=new StackEmptyException();
			throw e;  	 
		}
		return data[top];
		//time complexity=O(1)
	}
	public void push(int elem) throws StackFullException
	{
		if(size()==data.length)
		{
			//StackFullException e=new StackFullException();
			//throw e;
			doubleCapacity();
			////time complexity=O(n) only when double capacity is called 
		}
		top++;
		data[top]=elem;
		////time complexity=O(1) on an average
	}
	private void doubleCapacity()
	{
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<=top;i++)
		{
			data[i]=temp[i];
		}
	}
	public int pop() throws StackEmptyException {
		if(size()==0)
		{
			//stack empyty exception 
			StackEmptyException e=new StackEmptyException();
			throw e;  	 
		}
		int temp=data[top];
		top--;
		return temp;
		//time complexity=O(1) 
	}
	
}
