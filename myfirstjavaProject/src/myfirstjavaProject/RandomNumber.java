package myfirstjavaProject;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
	
		Random random = new Random();
		
		// These are pusedo random numbers
		
		// Generating a random integer and storing it in integer.
		int pp  = random.nextInt(6); // We can limit size of the number by writing a certain value in nextInt.
		
//		double y = random.nextDouble();
//		boolean z = random.nextBoolean();
		System.out.println(pp);
	}
}
