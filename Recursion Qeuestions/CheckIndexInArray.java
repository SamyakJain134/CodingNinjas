package Recursion;

public class CheckIndexInArray {
	public static boolean checkNumber(int input[], int x) {
		
//		if(input[0]==x)
//        {
//            return true;
//        }
//        int smallInput[]=new int[input.length-1];
//		for(int i=1;i<input.length;i++)
//		{
//			smallInput[i-1]=input[i];
//		}
//        boolean smallans=checkNumber(smallInput,x);
//        if(smallans)
//        {
//            return true;
//        }
//        else
//            return false; 
		return helper(input, x, 0);
	}
	private static boolean helper(int input[], int x, int idx){
        if(idx == input.length){
            return false;
        }
        
        if(input[idx] == x){
            return true;
        }
        
        return helper(input, x, idx+1);
    }

	public static void main(String[] args) {
		int ary[]={1,2,3,4,5,6};
		int x=7;
		boolean bool=checkNumber(ary,x);
		System.out.println(bool);
		

	}

}
