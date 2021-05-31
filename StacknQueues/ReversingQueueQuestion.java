package StacknQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingQueueQuestion {

	public static void main(String[] args) {
		int arr[]= {5,6,7,4,4};
		Queue<Integer> queue=new LinkedList<>();
		for(int i=0 ;i<arr.length;i++ )
		{
			queue.add(arr[i]);
		}
		reverseQueue ( queue );
		while(!queue.isEmpty())
		{
			System.out.println(queue.poll());
		}
	

	}

	private static void reverseQueue(Queue<Integer> queue) {
		if(queue.size()<=1)
			return;
		int front=queue.poll();
		reverseQueue(queue);
		queue.add(front);
		
	}

}
