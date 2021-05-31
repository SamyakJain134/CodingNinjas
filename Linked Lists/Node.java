package LinkedList;

public class Node<T> {

	T data; //using generics
	Node<T> next; //reference to the next node
	Node(T data)
	{
		this.data=data;
		next=null;
	}

}
