package Maps;

import java.util.HashMap;

public class MaxFrequencyOfANumber {
	public static int countMaxFrequency(int ary[])
	{
		HashMap<Integer, Integer> hmap=new HashMap<>();
		hmap.put(ary[0], 1);
		int maxElement=ary[0];
		int maxFrequency=1;
		
		for (int i=1;i<ary.length;i++)
		{
			if(hmap.containsKey(ary[i]))
			{
				//update frequency	 
				int frequency = hmap.get(ary[i]);
				//frequency++;
				hmap.put(ary[i], frequency+1);
			}
			else //key not oresent
			{
				hmap.put(ary[i], 1);
			}
			int finalfrequency=hmap.get(ary[i]); //for cheking with earlier basic frequency
			if(finalfrequency>maxFrequency) 
			{
				maxFrequency=finalfrequency;
				maxElement=ary[i];
			}
		}
		if(maxFrequency > (ary.length/2))
		{
			return maxElement;
		}
		else
			 return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
