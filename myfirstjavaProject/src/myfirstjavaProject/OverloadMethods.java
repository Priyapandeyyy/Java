package myfirstjavaProject;

public class OverloadMethods {

	public static void main(String[] args) {
		
		// overloaded methods = methods that share the same name but have different parameters
		//                      method name + parameters  = method signature
		
		int x = add(5,2,9);
		System.out.println(x);
	}
	
		static int add(int a, int b) {
			System.out.println("Mahadev");
			return a + b;
		}
		static int add(int a, int b, int c) {
			System.out.println("Bhole Baba");
			return a + b + c;         
		}
		static int add(int a, int b, int c, int d) {
			System.out.println("Namah Shivay");
			return a + b + c + d; 
		}
	}
			// This will give an error to solve that we can do two things 
			// 1. can change the value (but it will not be overloaded anymore)
			// 2. Can add different value to methods.
