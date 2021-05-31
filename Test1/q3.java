package Test1;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n,count=0;
        while(temp>0)
        {
        	int lastdig=temp%10;
        	count++;
        	temp=temp/10;
        }
        int sum=0;
        while(temp>0)
        {
        	int pro=1;
        	int lastdig=temp%10;
        	int j=1;
        	while(j<=count)
        	{
        		pro=pro*lastdig;
        		j++;
        	}
        	sum=sum+pro;
        	temp=temp/10;
        }
        if(sum==n) 
        {
        	System.out.println(true);
        }
        else
        {
        	System.out.println(false);
        }
	}

}
