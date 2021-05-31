package SortingRecursion;

import java.util.Scanner;

public class ReturnKeypadNumberStringEasy {
	public static void printKeypad(int input){
		printKeypad(input,"");
		
	}
    public static void printKeypad(int input,String outputSoFar)
    {
        if(input==0)
        {
            System.out.println(outputSoFar);
            return;
        }
        char[] characterForUnitDigit=findCharacterForUnitDigit(input%10);
        for(int i=0;i<characterForUnitDigit.length;i++)
        {
            printKeypad(input/10,characterForUnitDigit[i]+outputSoFar);
        }
    }
    
    public static char[] findCharacterForUnitDigit(int n)
	{
		char[] charForUnitDigit=null;
		switch(n)
		{
		case 2:
			charForUnitDigit=new char[] { 'a', 'b' ,'c'};
			break;
		
		case 3:
			charForUnitDigit=new char[] { 'd', 'e' ,'f'};
		break;
	
		case 4:
			charForUnitDigit=new char[] { 'g', 'h' ,'i'};
		break;

		case 5:
			charForUnitDigit=new char[] { 'j', 'k' ,'l'};
		break;

		case 6:
			charForUnitDigit=new char[] { 'm', 'n' ,'o'};
			break;

		case 7:
			charForUnitDigit=new char[] { 'p', 'q' ,'r' ,'s'};
		break;

		case 8:
			charForUnitDigit=new char[] { 't', 'u' ,'v'};
		break;

		case 9:
			charForUnitDigit=new char[] { 'w', 'x' ,'y' ,'z'};
		break;
		}
		return charForUnitDigit;
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		ReturnKeypadNumberStringEasy.printKeypad(input);
	}

}
