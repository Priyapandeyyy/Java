package myfirstjavaProject;

public class Array {

	public static void main(String[] args) {
		
		// array = used to store multiple value in a single variable.
		
		String[] cars = {"ferrari", "Camaro", "Tesla"};
		
//		cars[0] = "Mustang"; (output = Mustang)
		
//		System.out.println(cars[0]); (will show ferrari as output while the for loop will post all the cars)
		
//		System.out.println(cars[3]); (error)
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		
		
		
		// WE AN ALSO WRITE ARRAY LIKE THIS
		
		/*
		String[] cars = new String[3];
		
		cars[0] = "Camero";
		cars[1] = "ferrari";
		cars[2] = "Tesla";
		
		System.out.println(cars[2]);
		*/
		
	}
}
