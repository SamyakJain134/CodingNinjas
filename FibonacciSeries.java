package FibonocciSeries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int position=scan.nextInt();
        int n1=0; //first number
        int n2=1; //second number 
        int fibnum = 0; //output number 
        int counter;
        if(position==1)
        {
            fibnum=n1;
        }
        else if(position==2)
        {
            fibnum=n2;
        }
        else
        {
            for(counter=3;counter<=position;counter++)
            {
                fibnum=n2+n1;
                n1=n2;
                n2=fibnum;
            }
            
        }
        System.out.println(n2);


	}

}
