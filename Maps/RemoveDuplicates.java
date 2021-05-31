package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	public static ArrayList<Integer> removeDuplicates(int ary[])
	{
		ArrayList<Integer> output=new ArrayList<>();
		HashMap<Integer, Boolean> seen = new HashMap<>();
		for(int i=0;i< ary.length;i++)
		{
			if(seen.containsKey(ary[i]))
			{
				continue;	
			}
			
		
		output.add(ary[i]); //array list me add kr denge agar add nahi hoga toh 
		seen.put(ary[i], true); // 
		
		}
		return output;
	}
	public static void main(String[] args) {
		int ary[]= {1,2,3,4,55,6,7,75,42,2,2,2,3,3,45,543,2,4235,643,634,54124,24,324,32};
		ArrayList<Integer> arr = removeDuplicates(ary);
		for(Integer i : arr)
		{
			System.out.print(i + " ");
		}
	}

}
