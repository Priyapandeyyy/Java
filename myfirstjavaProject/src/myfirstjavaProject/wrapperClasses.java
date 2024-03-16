package myfirstjavaProject;

public class wrapperClasses {
	
	public static void main(String[] args) {
		
		// wrapper class = provides a way to use primitive data types as reference data types reference data types contain useful methods.
		//                 can be used with collections (ex.ArrayList).
		
		// primitive            // wrapper
		//----------            //----------
		// boolean               Boolean
		// char                  Character
		// int                   Integer
		// double                Double
		
		
		// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper class. 
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
		
		
		// THERE IS NO STRING AS IT IS LAREADY REFERENCE DATA TYPE.
		
		
		// autoboxing
		
		Boolean a = true;
		Character b = '$';
		Integer c = 123;
		Double d = 3.14;
		String e = "Priya";
		
		// Unboxing
		
		if(a==true) {
			System.out.println("This is true");
		}
	}
}

// DIsadvanttage = Accessing a value through wrapper class takes a lot more steps and time.
// Primitive value is lost faster then reference data type.
