package StacknQueues;

public class StackUse {

	
	
	
	public static void main(String[] args) throws StackFullException {
//		StackUsingArrays stack=new StackUsingArrays(3);
//		//stack.data
//		for(int i=1;i<=5;i++)
//		{
//			stack.push(i);
//		}
//		while(!stack.isEmpty())
//		{
//			try {
//				System.out.println(stack.pop());
//			} catch (StackEmptyException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();//never reach here 
//			}
//		}
		
		
		
		//arrays ke case me generics use nhi kar paa rahe the 
		//Size ka chakkr nahi h LL me 
		StackUsingLL<Integer> stack= new StackUsingLL<>();
		for(int i=1;i<=5;i++)
		{
			stack.push(i);
		}
		while(!stack.isEmpty())
		{
			try {
				System.out.println(stack.pop());
			} 
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
