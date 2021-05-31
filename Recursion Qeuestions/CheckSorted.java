package Recursion;

public class CheckSorted {
	public static boolean checkSorted(int input[])
	{
		if(input.length<=1)
		{
			return true;
		}
		int smallInput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallInput[i-1]=input[i];
		}
		boolean smallans=checkSorted(smallInput);
		if(!smallans)
		{
			return false;
		}
		if(input[0]<=input[1])
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean checkSorted2(int input[])
	{
		if(input.length<=1)
		{
			return true;
		}
		if(input[0]>input[1])
		{
			return false;
		}
		
		int smallInput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallInput[i-1]=input[i];
		}
		boolean smallans=checkSorted2(smallInput);
			return smallans;
//		if(smallans)
//		{
//			return true;
//		}
//		else
//			return false;
	}
	public static boolean checksortedbetter(int input[])
	{
		return checksortedbetter(input,0);
	}
	private static boolean checksortedbetter(int input[],int si)
	{
		if(si>=input.length-1)
		{
			return true;
		}
		if(input[si]>input[si+1])
		{
			return false;
		}
		boolean smallanswer=checksortedbetter(input, si+1);
				return smallanswer;
	}

	public static void main(String[] args) {
		int input[]= {1,7,3,6,9};
		System.out.println(checkSorted2(input));
		System.out.println(checksortedbetter(input));
		
		

	}

}
