package logging;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogging {

	private static Logger log = Logger.getLogger(JavaLogging.class.getName());

	public static void main(String[] args) {
		// system Class, java util Logger, Jewel...
		// Simpliest Java Logging:
//		loggerOne();
		// Java util logger: (leidzia lokaliai isvesti prasmingas zinutes)
		loggerTwo();
	}

	private static void loggerTwo() {
		// Finest, finer, fine, config, info, warning, severe, all, off...
		log.warning("It's almost weekend!");
		log.info("Weather forecast for the week is ....");
		log.log(Level.ALL, "All messages:");
	}

	private static void loggerOne() {

		try (Scanner input = new Scanner(System.in)) {
			System.setErr(new PrintStream("log.txt"));
			System.err.println("Info message");
			System.err.println("Error message");
			int num = input.nextInt();
			if (num == 0) {
				throw new Exception("Error message");
			} else {
				System.out.println("Okey " + num);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
