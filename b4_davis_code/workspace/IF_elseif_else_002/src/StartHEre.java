import javax.swing.JOptionPane;

public class StartHEre {

	
	/*
	 *  if Elseif else decision making
	 */
	
	public static void main(String[] args) {
		
		String ageInput = "";
		int age = 0;
		String msg = "";
		String genderInput = "";
		char gender = ' ';
		
		ageInput = JOptionPane.showInputDialog("Hello what is your age? ");
		age = Integer.parseInt(ageInput);
		
		
		/* next task is too get gender, male female
		* 1. create vars - String input, convert to upper case and char
		* 2. add to if block as booleans
		* 3. TEST
		*/
		
		//Boolean math use && for "AND", use || for "OR"
		
		genderInput = JOptionPane.showInputDialog("Please tell me your gender, as M or F -baby dino");
		genderInput = genderInput.toUpperCase();
		
		
		
		// Input grade in school as 9, 10 , 11, 12
		
		
		//char ch= str.charAt(0);
		gender = genderInput.charAt(0);
		msg = "Your gender is " + genderInput + " gender char is " + gender +" baby dino";
		JOptionPane.showMessageDialog(null, msg);
		
		if (age < 18 && gender == 'F'){
			msg = "You are a minor female dino";
			JOptionPane.showMessageDialog(null, msg);
			
			
		
		}else if (age <= 18 && gender == 'M'){
			
			msg = "You are a minor male dino";
			JOptionPane.showMessageDialog(null, msg);
			
			
		}else if (age > 18 && gender == 'F'){
			
			msg = "You are a adult female dino";
			JOptionPane.showMessageDialog(null, msg);
			
		}else if (age > 18 && gender == 'M'){
			
			msg = "You are a adult male dino";
			JOptionPane.showMessageDialog(null, msg);
			
			
		}else {
			
			msg = "Sorry, input error";
			JOptionPane.showMessageDialog(null, msg);
			
		}
			
		
		
		

	}

}
