package Maps;

import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map= new HashMap<>();
		//put function

		map.put("abc", 1);
		map.put("def", 2);
		map.put("abc", 3); // key update hogi 
		map.put("def", 4); // size abhi bi 2 hi rahega 	
		map.put("abc2", 4); 
		map.put("def2", 5); //abhi size 4 ho jayega
		
		// size
		System.out.println("Size = "+ map.size());
		//to check presence
		if(map.containsKey("abc"))
		{
			System.out.println("has abc");
		}
		if(map.containsKey("abc1"))
		{
			System.out.println("has abc1");
		}
		
		//get value corresponding to a key
		//agar key nahi hai toh get null return karta hai 
		//agar value directly access karege to null pointer exception aa jayega 
		
		int v=0;
		if(map.containsKey("abc1"))
		{
			map.get("abc");
		}
		System.out.println(v  );
		
		//remove a value 
		int deletedValue=map.remove("abc");
		System.out.println(deletedValue);
		
		//t check it conttains a value 
		// this function is O(n) but 
		if(map.containsValue(2))
		{
			System.out.println("has 2 as value");
		}
		// key k uoar saare operation fast hoyenge 
		// value ke uoar nahi hoyenge 
		
		
		//iterate over map
		Set<String> keys=map.keySet(); //returns all keys in datatype caled set 
		for(String str:keys)
		{
			 System.out.println(str);
		}
	}

}
