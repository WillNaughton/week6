package interfaces;

public class Application {

	public static void main(String[] args) {
		
		Logger logger = new FileLogger();
		
		logger.info("hello");
		logger.warning("this is a warning");
		logger.error("oops, this is an error");
		logger.fatal("fatal error");
		logger.close();
	}

}
