package Patterns;

import java.util.Scanner;

public class alphaPattern {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i=1;
while(i<=n) {
	int j=1;
	while(j<=i) {
		System.out.print((char)('A'+i-1));
		j=j+1;
	}
	System.out.println();
	i++;
}
}
}