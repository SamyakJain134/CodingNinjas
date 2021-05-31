package Patterns;

import java.util.Scanner;

public class invertednumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=1;
        while(i<=n) {
        	int j=1;
        	int s=n-i+1;
        	while(j<=n-i+1) 
        	{
        		System.out.print(s);
        		j=j+1;
        		
        	}
        	s--;
        	System.out.println();
        	i++;
        }
	}

}
