package Patterns;

import java.util.Scanner;

public class PatternStar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=1;
        while(i<=n) {
        	int j=1;
        	int starting=i;
        	while(j<=i) {
        		System.out.print(starting);
        		j=j+1;
        		starting--;
        	}
        	System.out.println();
        	i++;
        }
	}

}
