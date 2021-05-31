package Recursion;

public class PalindromeUsingRecursion {
	public static boolean isStringPalindrome(String input) {
		return helper(input ,0,input.length()-1);

	}
    private static boolean helper(String input, int start,int end)
    {
    	 if(input.length()==0||input.length()==1)
         {
             return true;
         }
         if((input.charAt(start))!=(input.charAt(end)))
         {
             return false;
         }
         // If there are more than  
         // two characters, check if 
         // middle substring is also 
         // palindrome or not. 
         if(start<end+1) 
         {
             return helper(input,start+1,end-1);
         }
         return true;
    }

	public static void main(String[] args) {
		isStringPalindrome("abcba");

	}

}
