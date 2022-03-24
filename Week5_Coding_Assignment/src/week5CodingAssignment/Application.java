package week5CodingAssignment;

public class Application {
	
	public static void main(String[] args) {
		
	Logger logger = new AsteriskLogger();
	Logger anotherLogger= new SpacedLogger();
	
	//Constructors below
	//passing strings to AsteriskLogger
	logger.log("Hello");

	logger.error("Howdy");
	
	//passing strings to SpacedLogger
	anotherLogger.log("Bonjour");
	
	anotherLogger.error("Hola");

}
}
