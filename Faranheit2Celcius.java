package Lecture4Functions;

import java.util.Scanner;

public class Faranheit2Celcius {
	public static void printFahrenheitTable(int start, int end, int step) {
		for(int i=start;i<=end;i=i+step)
        {
			 int c = (5/9)*(i - 32);
			 System.out.println(i+" "+c);
			 
        }
	}
	public static void main(String Args[])
	{
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		//Faranheit2Celcius solution = null;
		printFahrenheitTable(start, end, step);
	}

}
