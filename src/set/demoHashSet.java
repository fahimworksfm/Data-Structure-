package set;

import java.util.HashSet;
import java.util.Set;

public class demoHashSet {

	public static void main(String[] args) {
	
		Set <Double> nums = new HashSet<>();
		
		nums.add(100.75);
		nums.add(200.35);
		nums.add(100.75);
		
		System.out.println(nums);
		
		//Hashset doesn't allow duplication

	}

}
