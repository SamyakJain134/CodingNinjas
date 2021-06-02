package Maps;

import java.util.Arrays;
import java.util.HashMap;

public class PrintInterSectionOfArray {
	public static void PrintIntersection(int arr1[],int arr2[])
	{
		HashMap<Integer, Integer> hmap=new HashMap<>();
		for(int i=0;i<arr1.length;i++)
		{
			if(hmap.containsKey(arr1[i]))
			{
				hmap.put(arr1[i], hmap.get(arr1[i])+1);
			}
			else
			{
				hmap.put(arr1[i], 1);
			}
		}
		Arrays.sort(arr2);
		for(int i=0;i<arr2.length;i++)
		{
			if(hmap.containsKey(arr2[i]))
			{
				int freq=hmap.get(arr2[i]);
				freq--;
				if(freq==0)
				{
					hmap.remove(arr2[i]);
				}
				else
				{
					hmap.put(arr2[i], freq);
				}
				System.out.print(arr2[i]+" ");
			}
			
		}
	}
	

	public static void main(String[] args) {
		int ary1[]= {2,3,4,5,4,7,42,23,67,3,2,5};
		int ary2[]= {12,57,21,4432,2,3,6,3,4,5,6,8,4,23};
		PrintIntersection(ary1, ary2);
	}

}
