package Recursion;

public class CheckLAstIndex {
	public static int lastIndex(int input[], int x) {
		return helper(input, x, 0);
	}
    
    private static int helper(int input[], int x, int si){
       if(si==input.length)
		{
			return -1;
		}
        int ans=helper(input,x,si+1);
        if(ans==x)
        {
            return si;
        }
        if(input[si]==x)
        {
            return si;
        }
        else
            return -1;
    }


	public static void main(String[] args) {
		int input[]= {1,7,3,6,9};
		int x=3;
		int ans=lastIndex(input, x);
		System.out.println(ans);

	}

}
