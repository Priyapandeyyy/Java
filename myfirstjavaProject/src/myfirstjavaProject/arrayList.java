package myfirstjavaProject;
import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		// ArrayList = a resizable array.
		//             Elements can be added and removed after compilation phase.
		//             store reference data types.
		
		ArrayList<String>food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("burger");
		food.add("momos");
		
		food.set(0, "sushi");  // changes the value at given index
		food.remove(2);
		food.clear();
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		// If we have to add other data type then we will use wrapper class.
	}
}
