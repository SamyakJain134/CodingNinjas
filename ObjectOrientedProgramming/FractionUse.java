package DataStructures;

public class FractionUse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1=new Fraction(20,30); //Fraction class ka constructor banaya hai usme parameters pass kiye hai 
		f1.print(); // print function fraction class me banaya hai fraction SIMPLIFIED form m call krne ke liye ,fraction simplified form me store hone chahiye 
		
		// abb seters and getters  layenge , constructor banayenge 
		
		//yaha tak answer was 2/3
		f1.setNumerator(12); // yahaa par apn ko value set karni hai toh
		
		//12/3=4/1
		int d=f1.getDenominator();
		System.out.println(d); //ans=1
		f1.print(); //4/1=4
		
		f1.setNumerator(10);
		f1.setDenominator(30);
		f1.print(); // 1/3
		
		Fraction f2=new Fraction(3,4);
		f1.add(f2); // non static function , f1(object) ke upar call ho rha h , ek object call karke dusra parameter as a parameter pass kar rhe h 
		//f1=> 13/12
		f1.print();
		//f2=>3/4
		f2.print();
		
		
		Fraction f3=new Fraction(4,5);
		f3.multiply(f2); //multiply f3byf2=f3
		//f3 change ho jayega 12/20=3/5 f2 same rahega 
		f3.print();
		f2.print();
		
		Fraction f4=Fraction.add(f1,f3); //creating a static function which is going to take two fraction and returns a new fraction 
		//class ke upar call kiahai add so static function
		f1.print();
		f3.print();
		f4.print();		
	}
}
