package AccountCreateTesting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger log = LogManager.getLogger(Log4jDemo.class); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.info("Information message");
		log.error("Error message");
		log.warn("Warning message");
		log.fatal("Fatal message");
		System.out.println("\n Completed");
	}

}
