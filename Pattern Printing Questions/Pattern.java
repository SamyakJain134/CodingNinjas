package Break_Continue;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=2;i<=n;i++)
        {
        	int count=0;
            for(int div=2;div<=i/2;div++)
            {
                if(i%div==0){
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
        }

	}

}
