package myfirstjavaProject;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine(); // This is important after a number as if we don't write that scanner will print out everything together thinking it is the end of the line.
		System.out.println("What is your favorite food? ");
		String food = scanner.nextLine();
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);
		
	}
}

//Scanner = It is a class, and is found in java.util. We an import it by using (import java.util.Scanner;)
//It is used for obtaining the input of the primitive types like int, double, etc)
