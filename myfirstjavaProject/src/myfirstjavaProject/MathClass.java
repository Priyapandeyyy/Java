package myfirstjavaProject;

import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		
//		Hypotenuse of a triangle
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y)); // Applied the formula z = sqrt(x^2 + y^2)
		System.out.println("The hypotenuse is : "+z);
		
		
	/*	double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y); // max = will tell the maximum number
		double z = Math.min(y, z); // min = will tell the minimum number
		double z = Math.abs(y); // abs = absolute value(number without -)
		double z = Math.sqrt(y); // sqrt = square root
		double z = Math.round(x); 
		double z = Math.ceil(x);
		double z = Math.floor(x);
		
		System.out.println(z);
		*/
	}
}
