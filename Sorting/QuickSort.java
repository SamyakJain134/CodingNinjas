package SortingRecursion;

public class QuickSort {
	public static void quickSort(int[] input) {
		quickSort(input,0,input.length-1);
	}
	private static void quickSort(int[] input,int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pivotpos=partition(input,si,ei);
        quickSort(input,si,pivotpos-1);
        quickSort(input,pivotpos+1,ei);
    }
    private static int partition(int[] input,int si,int ei)
    {
         int pivot=input[si];
        int k=si;
        int count=0;
        while(k<=ei)
        {
            if(pivot>input[k])
            {
                count++;
            }
            k++;
        }
        int pvPos=si+count; //to find the index of pivot element , 
        int temp=input[si];
        input[si]=input[pvPos];
        input[pvPos]=temp; // replace the position of element
        int i=si; //for arranging in ascending order 
        int j=ei; //for arranging in ascending order 
        while(i<pvPos&&j>pvPos)
        {
            if(input[i]<pivot)
            {
                i++;
            }
            else
            {
                if(input[j]>=pivot) // changed
                {
                    j--;
                }
                else
                {
                    int temp1=input[i];
                    input[i]=input[j];
                    input[j]=temp1; //changed
                    i++; //added
                    j--; //added
                }
            }

        }
        return pvPos;
    }

	public static void main(String[] args) {
		int input[]= {15,77,18,16,17,158,3,6,9};
		quickSort(input);
		for(int i=0;i<input.length;i++)
		{
			System.out.println(input[i]);
		}
	}

}
