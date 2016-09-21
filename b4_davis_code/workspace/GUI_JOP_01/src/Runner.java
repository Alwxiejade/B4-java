import javax.swing.JOptionPane;

/*
 * Why? This is a note to my future self!
 * Alex Davis / 4B / 25 Aug 2016
 * 
 * 1 JOPs for input, and output
 * Java option pane
 */
public class Runner {
	
	//class variables or field variables

	public static void main(String[] args) {
		
		//local or method Variables
		String firstName = ""; 
		String showMsg = "";
		String lastName = "";
		
		firstName = JOptionPane.showInputDialog("Hey! What is your first name?");
		showMsg ="Nice to meet ya " + firstName;
		JOptionPane.showMessageDialog(null, showMsg);

		lastName = JOptionPane.showInputDialog("What is your last name?");
		showMsg ="Nice last name " + firstName + " " + lastName;
		JOptionPane.showMessageDialog(null, showMsg);
		
		
		// Convert String to int
		// 1. Define an int variable (at the top)
		int age = 0;
				//2. If you don't already have a string variable make it poppin
		String ageString = "16";
		age = Integer.parseInt(ageString);
		
		ageString = JOptionPane.showInputDialog("How young are you?");//This is a string, just typed numbers
		age = Integer.parseInt(ageString); //this is math
		age = age + 5;
		JOptionPane.showMessageDialog(null, "Your age in 5 years will be " + age);
		
		
		String lengthString = "";
		String widthString = "";
		String heightString = "";
		
	
		
		
		float length = 0;
		float width = 0;
		float height = 0;
		
		
		lengthString = JOptionPane.showInputDialog("What is the length of you box?");
		length = Float.parseFloat(lengthString);
		
		widthString = JOptionPane.showInputDialog("What is the width of the box?");
		width = Float.parseFloat(widthString);
				
		heightString = JOptionPane.showInputDialog("What is the height of the box?");
		height = Float.parseFloat(heightString);
		
		float volume = length * width * height;
		JOptionPane.showMessageDialog(null, "Your box is " + volume);
		
		//Volume is length * width * height
		//JOptionPane.showMessageDialog(null, volume_result);
		
		
		
		
		
		//Convert String to float
		
		
		System.exit(0);
	}
	
	

}
