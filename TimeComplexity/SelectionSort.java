package TimeComplexity;

public class SelectionSort {
	public static void selectionsort(int input[])
	{
		//i=beginindex
		for(int i=0;i<input.length;i++)
		{
			int min=input[i];
			int minPos=i;
			for(int j=i;j<input.length;j++)
			{
				if(input[j]<min)
				{
					min=input[j];
					minPos=j;
				}
			}
			int temp=input[minPos];
			input[minPos]=input[i];
			input[i]=temp;
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
			
			selectionsort(input);
			long endTime=System.currentTimeMillis();
			System.out.println("Time By Selection Sort for " + n + " is " + (endTime-startTime));
		}
	}

}
