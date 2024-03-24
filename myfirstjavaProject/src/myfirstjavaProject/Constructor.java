package myfirstjavaProject;

public class Constructor {
		
		// Constructor = special method that is called when an object is instantiated (created)
		
	    String name;
	    int age;
	    double weight;
	    
		Constructor(String name, int age, double weight){
			// This is how constructors are created
			
			this.name = name;
			this.age = age;
			this.weight = weight;
			
		}
		
		void eat() {
			System.out.println(this.name+" is eating");
		}
		
		void drink() {
			System.out.println(this.name+" is drinking");
		}
		
		// A constructor is a special method that works behind the scenes that will create an instance of the class for us
		
}
