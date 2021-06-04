package Recursion;
//Given an array consisting of positive and negative integers, 
//find the length of the longest subarray whose sum is zero.
public class LongestSubsetSumToZero {
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		
        int max_len = 0; 
        for (int i = 0; i < arr.length; i++) { 
             
            // starting point 
            int curr_sum = 0; 
  
            // try all subarrays starting with 'i' 
            for (int j = i; j < arr.length; j++) { 
                curr_sum += arr[j]; 
  
                // If curr_sum becomes 0, then update 
                
                if (curr_sum == 0) 
                    max_len = Math.max(max_len, j - i + 1); 
            } 
        } 
        return max_len; 
	}
}
