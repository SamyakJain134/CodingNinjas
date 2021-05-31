package StacknQueues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<>();
		//LinkedList class ne QUEUE implement kiya hua hai 
		//Queue ek interface hai and uska object nhi banaya ja sakta ,
		//so linked list class ka object banaya kyuki vo use implement karti hai 
		queue.add(10); //enqueue wala kaam karega
		queue.add(10);
		System.out.println(queue.poll());//dequque wala kaam karega
		System.out.println(queue.size());
		System.out.println(queue.peek()); //front wala kaam akrega 	
		
	}

}
