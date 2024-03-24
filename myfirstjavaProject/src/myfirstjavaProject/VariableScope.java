package myfirstjavaProject;

import java.util.Random;

public class VariableScope {
	
		// local => declared inside a methods
		//          visible only to that method.
		
		// global => declared outside a method, but within a class 
		//           visible to all parts of a class
	
	
	Random random;
	int number = 0;
	
	       VariableScope(){        
	           random = new Random();
	           roll();
	           }

           void roll() {                
	           number = random.nextInt(6)+1;
	           System.out.println(number);
	           }
           }
	
	
	
	// OR :
	
	
//		VariableScope(){            // This is a local
//			Random random = new Random();
//			int number = 0;
//			roll(random,number);
//		}
//		
//		void roll(Random random,int number) {                  // This is global
//			number = random.nextInt(6)+1;
//			System.out.println(number);
//		}
//	}
