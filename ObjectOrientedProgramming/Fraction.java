package DataStructures;

public class Fraction {
	private int numerator; //private esliye kyuki we dont want anyone to use these values 
	private int denominator;

	public Fraction(int numerator ,int denominator) {
		this.numerator=numerator;
		if(denominator==0)
		{
			//TODO error out
		}
		this.denominator=denominator;
		simplify(); //jab bhi numerator aur denominator change ho rha hai tab tab chahiye  
		//simplify function sirf class ko chahiye esliye private rakhne ka 
		
	}
	private void simplify() 
	{
		//we need to find largest value that divides both num and denominator
		
		int gcd=1;
		int smaller=Math.min(numerator, denominator);
		for(int i=2;i<=smaller;i++)
		{
			if(numerator % i==0 && denominator % i==0) 
			{
				gcd = i;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
		
	}
	public void setNumerator(int numerator) {
		this.numerator=numerator;
		simplify();
		//return numerator;
	}
	
	public void setDenominator(int denominator) {
		if(denominator==0)
		{
			return;
		}
		this.denominator=denominator;
		simplify();
		//return denominator;
	}
	public int getDenominator() {
		//this.denominator=denominator;
		return denominator;
	}
	public int getNumerator() {
		//this.numerator=numerator;
		return numerator;
	}
	public void print()
	{
		if(denominator==1)
		{
			System.out.println(numerator);
		}
		else
		{
			System.out.println(numerator+ "/"+denominator);
		}
	}
	public void add(Fraction f2)
	{
		this.numerator=this.numerator*f2.denominator+this.denominator*f2.numerator;
		this.denominator=this.denominator*f2.denominator;
		simplify();
	}
	public void multiply(Fraction f2)
	{
		this.numerator=this.numerator*f2.numerator;
		this.denominator=this.denominator*f2.denominator;
		simplify();
	}
	public static Fraction add(Fraction f1,Fraction f3)
	{
		int newnum=f1.numerator*f3.denominator+f3.numerator*f1.denominator;
		int newdem=f1.denominator*f3.denominator;
		Fraction f =new Fraction(newnum,newdem);
		return f;
		
	}

}
