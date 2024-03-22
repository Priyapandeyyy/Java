package myfirstjavaProject;

public class printf {

	public static void main(String[] args) {
		
		// printf() = an optional method to control, format, and display text to the console window
		//            two arguments = format string + (object/variable/value)
		//            % [flags] [precision] [width] [conversion-character]
		
//		System.out.printf("This is a format string %d", 123);  
		// OUTPUT => This is a format string 123
		
		// %d => This is a format specifier (wherever we put %d the value ouside of "" will print there.
		
//		System.out.println("%d This is a format string", 123);  
		// OUTPUT => 123 This is a format string 
		
		
		// [✨✨ CONVERSION CHARACTER ✨✨]
		
		boolean meme = true;
		char myChar = '#';
		String name = "Priya";
		int myInt = 10;
		double myDouble = 20000;
		
//		System.out.printf("%b", meme);   // For the conversion character to display boolean.
//		System.out.printf("%c", myChar);  // For character
//		System.out.printf("%s", name);    // For String
//		System.out.printf("%d", myInt);    // For integer
//		System.out.printf("%f", myDouble);  // For double
		
		
		// [✨✨ WIDTH ✨✨]
		
		// minimum number of characters to be written as output.
//		System.out.printf("Hello %10s", name); 
		// OUTPUT => Hello          Priya
		// If i add -10 then the space will be after Priya
		
		// [✨✨PRECISION ✨✨]
		// sets number of digits of precision when outputting floating-point values.
		
//		System.out.printf("You have this much money %.2f",myDouble);
		
		// OUTPUT => You have this much money 20000.00 (two zero after the double as specified in printf).)

		
		// [✨✨ FLAGS ✨✨]
		
		// adds an effect to output based on the flag added to format specifier 
		// - : left-justify.
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value.
		// 0 : numeric values are zero-padded.
		// , : comma grouping separator if numbers > 1000.
		
		System.out.printf("You have this much money %,f",myDouble);
	}
}

