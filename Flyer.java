
public class Flyer {
	
	public static void main(String[] args){
		
		Flyer startProgram = new Flyer();
		startProgram.createAirplaneDate();
		System.out.println("Start Program was successful");
		
		Questions myQuestions = new Questions();
		
	}

	private void createAirplaneDate() {
		
		Data F15 = new Data();
			F15.setEngineType("jet");
			F15.setEngineNumber(1);
			F15.setEngineLocation("body");
			
		Data F16 = new Data();
			F15.setEngineType("jet");
			F15.setEngineNumber(1);
			F15.setEngineLocation("body");
			
		Data F22 = new Data();
			F15.setEngineType("jet");
			F15.setEngineNumber(1);
			F15.setEngineLocation("body");
			
		Data F35 = new Data();
			F15.setEngineType("jet");
			F15.setEngineNumber(1);
			F15.setEngineLocation("body");
			
		Data A10 = new Data();
			F15.setEngineType("jet");
			F15.setEngineNumber(2);
			F15.setEngineLocation("tail");
		
	}

}
