package Maps;

import java.util.ArrayList;
import java.util.HashSet;

public class ExtractUniqueCharacterFromString {
public static String extracUniquecharacer(String str)
{
	String s="";
	ArrayList<Character> list=new ArrayList<Character>();
	HashSet<Character> charCount=new HashSet<>();
	for(int i=0;i<str.length();i++)
	{
		if(!charCount.contains(str.charAt(i)))
		{
			charCount.add(str.charAt(i));
			list.add(str.charAt(1));
		}
	}
	for(char ch: list)
	{
		s=s+ch;
	}
	return s;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
