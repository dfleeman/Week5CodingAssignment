package week5CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
		//Spaced log
		String spaced = log.replace("", " ");
		System.out.println(spaced);
		//Adding a line to allow console to be easier to read
		System.out.println("\n");
	
		
	}

	@Override
	public void error(String error) {
		
		//Spaced error
		String spacedString = error.replace("", " ");
		System.out.println("ERROR: " + spacedString);
	}

	

}
