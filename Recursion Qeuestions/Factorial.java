package Recursion;

public class Factorial {
	
	public static int fact(int n)
	{
		if(n==0) // ye base case k lie banaya h take functio bar bar call na ho
			
		{
			return 1; //base case
		}
		int smallAnswer=fact(n-1);
		return n*smallAnswer;
	}
	public static int sum(int j)
	{
		if(j==1)
			return 1;
		int smallAnswer=sum(j-1);
		return j+smallAnswer;
	}

	public static void main(String[] args) {
		int n=3;
		int ans=fact(n);
		System.out.println(ans);
		 int j=5;
		 int ans1=sum(j);
		 System.out.println(ans1);

	}

}
