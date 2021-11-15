package array;

import java.util.Arrays;

public class demoArray {

	public static void main(String[] args) {

		
		int [] score;
		
		score = new int[4];
		score[0] = 44;
		score[1] = 90;
		score[2] = 30;
		score[3] = 55;
		
		System.out.println(score[2]+ ", "+score[1]);

		
		
		String [] names1 = {"Fahim", "Ahmed", "Masad", "Mansur"};
		
		System.out.println(Arrays.toString(names1));
		
		for(int i=0; i<names1.length; i++) {
			
			System.out.println(names1[i]);
		}
		
		
	}
	
	//each array has a length 
	//each array has minimum index and max index
	//max index = length -1

}
