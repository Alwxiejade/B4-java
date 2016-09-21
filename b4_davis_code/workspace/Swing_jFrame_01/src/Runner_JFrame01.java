import javax.swing.JFrame;

public class Runner_JFrame01 {

	public static void main(String[] args) {
		
		
		/*
		 * Jop's and jar'd
		 * put this in a while loop while(true)
		 * JOP "what do you want for a title?"
		 * JOP "what width do you want"
		 * Hight, do you want to create another (Y/N)
		 * If no, do a gracefull exit like Thanks you terrible human
		 * 
		 */
		
		String title = "My first Window!";
		int width = 800;
		int height = 600;
		
		createJFrame(title, width, height);
		

	}
	//name for this type of code is a "method"
	private static void createJFrame(String topTitle, int w, int h) {
		
		JFrame frame = new JFrame(topTitle);
		
		// frame is the name of an object  created from the JFrame class
		frame.setSize(800, 600);
		
	}
}
