package StacknQueues;
//FIFO
public class QueueUsingArrays {
	int data[];
	int front;  //index at which front element is tsored
	int rear;//index at which rear element is tsored
	int size;

	
	public QueueUsingArrays() {
		data=new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	public QueueUsingArrays(int capacity) {
		data=new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	int size() {
		return size;
		//time complexity =O(1)
	}
	boolean isEmpty()
	{
		//time complexity =O(1)
		return (size()==0);
	}
	int front() throws QueueEmptyException //return element at which front element is stored 
	{
		if(size()==0)
		{
			throw new QueueEmptyException();
		}
		return data[front];
		//time complexity =O(1)
	}
	void enqueue(int element) throws QueueFullException
	{
		if(size==data.length) //ye jab array ki length khtm ho jaaye 
		{
			//throw new QueueFullException();
			doubleCapacity();
			
		}
		if(size()==0)//ye pahele element k lie 
		{
			front=0;
		}
		size++;
		//circular queue hai ye becausse is case me size to 2 k equal hai to and new element ending me enter nahi hota hai
		//startine me jagah khali hai toh waha par enter hoga element
		rear=(rear+1)%data.length;
//		rear++;
//		if(rear==data.length)
//		{
//			rear=0 ;
//		}
		data[rear]=element;		
		//time complexity =O(1)
	}
	
	
	private void doubleCapacity() 
	{
		//blintlyt copy nahi karenge 
		//uss order me copy karenge jis order me queue me aaye the vo 
		int temp[]=data;
		data=new int[2*temp.length];
		int index=0;
		for(int i=front	; i< temp.length;i++)
		{
			data[index]=temp[i];
			index++;
		}
		for(int i=0 ; i <= front-1;i++)
		{
			data[index]=temp[i];
			index++;	
		}
		front=0;
		rear=temp.length-1;
		
	}

	
	
	int dequeue() throws  QueueEmptyException
	{
		if(size()==0)
		{
			throw new QueueEmptyException();
		}
		int temp=data[front];
		front++;
		if(front==data.length)
		{
			front=0;
		}
		size--;
		if(size==0) //abb queue me ek bhi element nahi bacha
		{
			front=-1;
			rear=-1;
		}
		return temp;
		//time complexity =O(1)
	}
}
