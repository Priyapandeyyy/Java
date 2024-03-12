package myfirstjavaProject;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		// while loop = executes a block of code as long as it's condition remains true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
	
		// while loop
//		while(name.isBlank()) {
//			System.out.print("Enter your name");
//			name = scanner.nextLine();
//		}
//		
//		System.out.println("Hello "+name);
		
		
		
		// do while loop = It will first execute the condition and then check the block of code
		
		do{
			System.out.print("Enter your name :");
			name = scanner.nextLine();
		}while(name.isBlank()); 
		
		System.out.println("Hello "+name);
		
	}
}
