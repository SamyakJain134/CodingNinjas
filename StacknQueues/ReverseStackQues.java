package StacknQueues;

import java.util.Stack;

public class ReverseStackQues {
	
	private static void reverseStack(Stack<Integer> stack, Stack<Integer> helper) 
	{
		if(stack.size()<=1)
		{
			return;
		}
		int topelement=stack.pop(); // esme top element aa jayega
		reverseStack(stack, helper);
		//reverse stack ko stack se helper me dalenge 
		while(!stack.isEmpty())
		{
			int top=stack.pop();
			helper.push(top);
		}
		//top element ko main stack me dalenge fir sari helper stack ko dobara main stack em dalenge
		stack.push(topelement);
		while(!helper.isEmpty())
		{
			int top=helper.pop();
			stack.push(top);
		}
	}


	public static void main(String[] args) {
		int arr[]= {5,6,7,4,4};
		Stack<Integer> stack=new Stack<>();
		Stack<Integer> helper=new Stack<>();
		for(int i=0 ;i<arr.length;i++ )
		{
			stack.push(arr[i]);
		}
		reverseStack ( stack, helper );
		while(!stack.empty())
		{
			System.out.println(stack.pop());
		}
	
	}
}
