package Patterns;

import java.util.Scanner;

public class alphaincreasingpattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			char s=(char)('A'+n-i);
			while(j<=i) {
				
				System.out.print(s);
				j=j+1;
				s=(char)(s+1);
			}
			System.out.println();
			i++;
		}
}
}
