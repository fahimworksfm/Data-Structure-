package map;

import java.util.HashMap;
import java.util.Map;

public class demoHashMap {

	public static void main(String[] args) {
	
		Map <Integer, String> students = new HashMap<>();
		
		students.put(1, "Abdullah");
		students.put(2, "Fahim");
		students.put(3, "Masad");
		students.put(4, "Lutfor");
		students.put(5, "Fahim");
		
		//Hashmap is a collection of key-value pair
		//you can have duplicate values but the key must be unique
		
		System.out.println(students);
		
		System.out.println(students.get(2));
		

	}

}
