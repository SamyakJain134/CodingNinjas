package Patterns;

import java.util.Scanner;

public class StarPattterntuff {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int i=1;
			int n1=(n+1)/2;
			int n2=n1-1;
			while(i<=n1) 
			{
				int j=1;
				int spaces=1;
				while(spaces<=n1-i)
				{
					System.out.print(" ");
					spaces++;
				}
	            j=1;
				while(j<=2*i-1)
				{
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
	        }
			while(i<=n2) {
				int spaces=1;
				int j=1;
				while(spaces<=n2-i-1) {
					System.out.print(" ");
					spaces++;
				}
				while(j<=2*i-1) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}

	}

}
