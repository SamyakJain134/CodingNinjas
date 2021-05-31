package Recursion;

public class RemoveX {
	public static String removeX(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		String ans="";
		if(str.charAt(0)!='x')
		{
			ans=ans+str.charAt(0);
		}
		String smallans=removeX(str.substring(1));
		return ans+smallans;
	}

	public static void main(String[] args) {
		String str="xabxccxax";
		System.out.println(removeX(str));

	}

}
