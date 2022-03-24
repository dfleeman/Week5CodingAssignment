package week5CodingAssignment;



public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		//Asterisks before and after Log
		System.out.println("***" + log + "***");
		//Adding a line to allow console to be easier to read
		System.out.println("\n");

	}

	@Override
	public void error(String error) {
		//Box around the error message
		System.out.println("******************");
		System.out.println("***" + "Error: "+ error + "***");
		System.out.println("******************");
		System.out.println("\n");

	}

}
