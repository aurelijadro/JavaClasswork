package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SL4J {
	private static final Logger LOGGER = LoggerFactory.getLogger(SL4J.class);

	public static void main(String[] args) {
		method1();
		method2();

		Person person1 = new Person("Anna");
		System.out.println(person1.getName());
	}

	private static void method2() {
		LOGGER.error("No such error");

	}

	private static void method1() {
		LOGGER.info("It's almost weekend");
		LOGGER.warn("WARNING!!!");

	}
}
