package Test1;

import java.util.Scanner;

public class NumberStarPattern1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=1;
        while(i<=n) 
        {
        	int j=n;
        	while(j>=1)
        	{
        		if(j==i)
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(j);
        		}
        		j--;
        	}
        	i++;
        	System.out.println();
        }
	}

}
