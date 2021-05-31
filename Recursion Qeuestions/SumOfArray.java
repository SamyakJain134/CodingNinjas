package Recursion;

public class SumOfArray {
	public static int sum(int input[]) {
		return sum(input,0);
	}
    private static int sum(int input[], int idx){
        if(idx == input.length){
            return 0;
        }
        
        int ans = input[idx];
        ans += sum(input, idx+1);
        
        return ans;
    }

	public static void main(String[] args) {
		int input[]= {1,7,3,6,9};
		System.out.println(sum(input));

	}

}
