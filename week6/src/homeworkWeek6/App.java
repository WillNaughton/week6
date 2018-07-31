package homeworkWeek6;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		Logger logger1 = new SpacedLogger();
	
		logger.log("HELLO");
		logger.error("hi");
		logger1.log("ews");
		System.out.println("     ");
		logger1.error("rw");
	}
}

