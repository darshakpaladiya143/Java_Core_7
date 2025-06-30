import org.apache.logging.log4j.Logger;       // ✅ Log4j Logger
import org.apache.logging.log4j.LogManager;   // ✅ Log4j LogManager

public class Hellolog4J {


    private static final Logger LOGGER = LogManager.getLogger(Hellolog4J.class);

	
	public static void main(String[] a) {

		/*
		 * 
		 * Console 
		 * File.log
		 * Mail that log using appenders 
		 * 
		 * 
		 */
  
        LOGGER.debug("This is a debug message");
        LOGGER.error("This is an error message");
        LOGGER.info("This is an info message");
		
		
		
	}
		

}
