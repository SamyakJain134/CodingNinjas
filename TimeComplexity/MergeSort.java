package TimeComplexity;

public class MergeSort {
	public static void mergeSort(int input[])
	{
		mergeSort(input,0,input.length-1);
	}
	private static void mergeSort(int input[],int si,int ei)
	{
		if(si>=ei)
		{
			return;
		}
		int mid=(si+ei)/2;
		mergeSort(input, si, mid);
		mergeSort(input, mid+1, ei);
		merge(input,si,ei);
	}
	private static void merge(int input[],int si,int ei)
	{
		int mid=(si+ei)/2;
		int ans[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=ei)
		{
			if(input[i]<input[j])
			{
				ans[k]=input[i];
				i++;
				k++;
			}
			else
			{
				ans[k]=input[j];
				j++;
				k++;
			}
		}
		while(i<=mid)
		{
			ans[k]=input[i];
			i++;
			k++;
		}
		while(j<=ei)
		{
			ans[k]=input[j];
			j++;
			k++;
		}
		for(int index=0;index<ans.length;index++)
		{
			input[index+si]=ans[index];
		}
	
	}

	public static void main(String[] args) {
		//taking input
				for(int n=10;n<=1000000;n=n*10)
				{
					int[] input=new int[n];
					for(int i=0;i<input.length;i++)
					{
						input[i]=input.length-i;
					}
					long startTime=System.currentTimeMillis();
					mergeSort(input);
					long endTime=System.currentTimeMillis();
					System.out.println("Time By Merge Sort for " + n + " is " + (endTime-startTime));
				}
	}

}
