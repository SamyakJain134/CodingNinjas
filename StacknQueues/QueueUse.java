package StacknQueues;

public class QueueUse {

	public static void main(String[] args) throws QueueEmptyException, QueueFullException {
		//QueueUsingArrays queues=new QueueUsingArrays(3);
		QueueUsingLinkedList<Integer> queue=new QueueUsingLinkedList<Integer>();
		for(int i=1;i<=5;i++)
		{
			//queues.enqueue(i);
			queue.enqueue(i);
		}
//		while(!queues.isEmpty())
//		{
//			try {
//				System.out.println(queues.dequeue());
//			} catch (QueueEmptyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		while(!queue.isEmpty())
		{
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
