// Expression = It is a construct made up of variables, operators, and method invocations, which are constructed according to the syntax of the language, that evaluates to a single value.


package myfirstjavaProject;

public class Expression {
	
	public static void main(String[] args) {
		
		// expression = operands & operators.
		// operands = values, variables, numbers, quantity.
		// operators = + - * / %
		
		double Novels = 20;
		
		Novels = (double) Novels / 3;  // It will give  6 instead of 6.666 because in integer devision we truncate any decimal portion.
		
		// We can cast a value as () and can write double in the brackets also changing the data type.
		
		// Novels--;   // This or Novels = Novels +1;
		
		System.out.println(Novels);
	}
}
