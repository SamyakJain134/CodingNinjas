package Test1;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int gap=0,i=1;
        while(i<=n) 
        {
        	gap=n-i;
        	int j=1;
        	int temp=i;
        	int count=0;
        	while(j<=2*n+1)
        	{
        		if(temp==j) {
        			System.out.print("*");
        			temp=temp+gap;
        			temp++;
        			j++;
        			count++;
        			if(count>2)
        			{
        				temp=-1;
        			}
        		}
        		else
        		{
        			System.out.print("0");
        			j++;
        		}
        	}
        	System.out.println();
        	i++;
        }

	}

}
