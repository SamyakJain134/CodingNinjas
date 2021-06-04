package Recursion;

public class EuclidianAlgoRithm {
public static int Euclidian(int a,int b)
	
	{
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		return a;
	}
//using recursion
public static int Euclidianusingrecursopn(int a,int b)

{
	if(b==0)
	{
		return a;
	}
	return Euclidianusingrecursopn(b, a%b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
