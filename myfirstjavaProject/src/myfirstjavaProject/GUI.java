package myfirstjavaProject;

import javax.swing.JOptionPane;


public class GUI {
	
	public static void main(String[] args) {
		
//		String Bhupendra = JOptionPane.showInputDialog("Apka Naam kya hai");
//		String Jogi = JOptionPane.showInputDialog("Us Mai kaha-kaha gaye hai");
//		String B = JOptionPane.showInputDialog("Naam Bataiye?");
		
		String name = JOptionPane.showInputDialog("Apka Naam kya hai");
		JOptionPane.showMessageDialog(null, "Hello " +name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
		
				
		// Integer.parseInt = converts string to integer
		// Double.parseInt
	}

}

//GUI = Graphical User Interface