
public class GradeCheck {

	public static void main(String[] args) {
		/*
		 * this is a testing program not a final program
		 * get a grade
		 * create a method called grading
		 * using syso's to show the grade result excellent, good...
		 * creat a second method called prediction, with a pass parm
		 * using syso show pass fail prediction
		 */
		
		grading ('A');
		System.out.println();
		grading ('B');
		System.out.println();
		grading ('C');
		System.out.println();
		grading ('D');
		System.out.println();
		grading ('F');
		System.out.println();
		grading ('a');
		System.out.println();
		grading ('s');
		
		

	} // end of main
	
	//Place a new method outside of any other method, but inside the class
	public static void grading(char letterGrade){
		
		int successPredictor = -10; 
		
		switch (letterGrade){
		
		case 'A':
			successPredictor = 5;
			System.out.println("You're Awesome!");
			break;
			
		case 'B':
			successPredictor = 4;
			System.out.println("You're basic!");
			
		case 'C':
			successPredictor = 3;
			System.out.println("Congrats!");
			break;
			
		case 'D':
			successPredictor = 2;
			System.out.println("Diploma, Dummy");
			
		case 'F':
			successPredictor = 1;
			System.out.println("Failure isn't funny");
			break;
			
		default:
			successPredictor = 0;
			System.out.println("Nothing matched, ERROR");
			
			
			
			
			
		}// end of case
		
		prediction(successPredictor);
		
	}//end of grading
	
	public static void prediction (int successFactor){
		
		switch (successFactor){
		
		case 5:
			System.out.println("Prediction is for great success in this course!");
			break;
			
		case 4:
			System.out.println("Prediction is for a lot of learning!");
			break;
			
		case 3:
			System.out.println("Prediction is for learning new stuff!");
			break;
			
		case 2:
			System.out.println("Prediction is for chance of trouble!");
			break;
			
		case 1:
			System.out.println("Prediction is for TROUBLE!");
			break;
			
		case 0:
			System.out.println("You broke it!");
			break;
			
			
			
			
		}
		
		
	}//end of prediction

} //end of GradeCheck
