package list;

import java.util.ArrayList;
import java.util.List;

public class demoArrayList {

	public static void main(String[] args) {
	
		List <Integer> l1 = new ArrayList<>();
		
		//arraylist is a List interface
		//ArrayList<Integer> l1 = new ArrayList<>();
		
		l1.add(11);
		l1.add(22);
		l1.add(32);
		l1.add(4);
	
		//arraylist is a dynamic array
		
		System.out.println(l1.size());
		
		l1.remove(3);
		
		System.out.println(l1.size());
		
		
	}

}
