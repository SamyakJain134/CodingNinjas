package Patterns;

import java.util.Scanner;

public class starpattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		while(i<=n) 
		{
			int spaces=1;
			while(spaces<=n-i)
			{
				System.out.print(" ");
				spaces++;
			}
			int j=1;
			int p=i;
			while(j<=i) {
				System.out.print(p);
				j++;
				p++;
			}
			j=1;
			p=2*i-1;
			while(j<=i-1) {
				System.out.print(p);
				j++;
				p--;
			}
			System.out.println();
			i++;
		}
	}

}
