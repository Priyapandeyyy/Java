package myfirstjavaProject;

import java.util.Scanner;

public class ForLoop {
	
	public static void main(String[] args) {
		
		// for loop = executes a block of code in a limited amount of times
		
//		for(int i = 10; i>=0; i-=2) {
//			System.out.println(i);
//			// we can write i-=2 here too. It will work the same
//		}
//		
//    System.out.println("LOOOLLL");

		
		
// Nested Loop = a loop inside another loop
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # or rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol);
			}
		}
	}
}
