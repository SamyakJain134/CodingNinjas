package Recursion;

public class ReplaceCharacterRecursively {
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.isEmpty())
		{
			return input;
		}
		String ans="";
		if(input.charAt(0)==c1)
		{
			ans=ans+c2;
		}
		else
		{
			ans=ans+input.charAt(0);
		}
		String smallans=replaceCharacter(input.substring(1),c1,c2);
		return ans+smallans;
		

	}

	public static void main(String[] args) {
		String str="abcxxzaacb";
		System.out.println(replaceCharacter(str, 'a', 'x'));

	}

}
