import javax.swing.JOptionPane;

public class PRunner {


	public static void main(String[] args) {
		
		
		Object[] possibilities = {"Pepperoni", "cheese", "combo", "pineapple", };
		String s = (String)JOptionPane.showInputDialog(
		                    null,
		                    "Please select a pizza",
		                    "Order a pizza" ,
		                    JOptionPane.PLAIN_MESSAGE
		                    null,
		                    possibilities,
		                    "Our special!");

		//If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
		    setLabel(s);
		    return;
		}

		//If you're here, the return value was null/empty.
		setLabel("Come on, finish the sentence!");

	}

}
