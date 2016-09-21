import javax.swing.JOptionPane;

public class AssignCouselor {

	public static void main(String[] args) {
		/*
		 * Use JOP for a grade
		 * get students last name
		 * convert to upper case
		 * pull out first letter of the last name
		 * sent lettter or method named getCounslor
		 * JOP coumselor for that student
		 *
		 */

		String lastName = "";
		char initialName= ' ';
		String msg = "";
		
		msg = "Hello, what is your last name?";
		lastName = JOptionPane.showInputDialog(msg);
		lastName = lastName.toUpperCase();
		//JOptionPane.showMessageDialog(null, lastName);
		initialName = lastName.charAt(0);
		//JOptionPane.showMessageDialog(null, initialName);
	}//end of main
	
	public static void getCouselor(char initialForLastName){
		/*A-D Ms. Joblin
		 * E-K Ms. Hull
		 * L-R Ms. Stafford
		 * S-Z Mr. Langley
		 */
		
	}

}//end of AssignCounselor
