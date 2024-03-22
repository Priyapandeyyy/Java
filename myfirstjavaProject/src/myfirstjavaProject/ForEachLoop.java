package myfirstjavaProject;

import java.util.*;

public class ForEachLoop {
	public static void main(String[] args) {
		
		// for-each = traversig technique to iterate through the elements in an array/collection less steps, more readable, less flexible
		
		//String[] animals = {"cat","dog","rat","bird"};
		
		// OR :
		
		ArrayList<String> animals = new ArrayList();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
		}
	}
}
