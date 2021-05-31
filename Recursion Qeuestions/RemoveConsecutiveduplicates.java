package Recursion;

public class RemoveConsecutiveduplicates {
	public static String removeConsecutiveDuplicates(String s) {
		return removeConsecutiveDuplicates(s,0,1);
	}
    private static String removeConsecutiveDuplicates(String s , int si, int ni)
    {
    	 if(s.length()<=1)
         {
             return s;
         }
         if(s.length()==ni)
         {
             return "";
         }
         String ans="";
         if(s.charAt(si)==s.charAt(ni))
         {
             ans=s.charAt(si)+s.substring(ni+1);
         }
         String smallans=removeConsecutiveDuplicates(s,si+1,ni+1);
         return ans+smallans;
    }

	public static void main(String[] args) {
		String str="abcxxzaacb";
		System.out.println(removeConsecutiveDuplicates(str));// TODO Auto-generated method stub

	}

}
