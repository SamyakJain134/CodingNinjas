package DataStructures;

public class DynamicArrayUse {

	public static void main(String[] args) {
		DynamicArray d = new DynamicArray(); //constructor which does not take any size 
		
		
		for (int i = 0; i < 100; i++) { //uske ander mai element daal pa rha hu 
			d.add(i + 10); //adds to the end [10,11,12,13,14...]
		}
		
		System.out.println(d.size()); //print the size how much you have filled in your dynamic array 
		
		d.set(4, 10); //4th index par 10 dalna hota h jab 
		System.out.println(d.get(3)); //to get the value at index 3 
		System.out.println(d.get(4));
		
		while (!d.isEmpty()) { //khali check karne k lie 
			System.out.println(d.removeLast()); //last element remove karne ke liye 
			System.out.println("size = " + d.size());
		}

	}

}
