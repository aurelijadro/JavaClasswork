package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {
	private static final Logger LOGGER = LoggerFactory.getLogger(Person.class);
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		LOGGER.info("Person created!");
		return "Person [name=" + name + "]";
	}

	public String getName() {
		LOGGER.error("Name is null");
		return name;
	}

}
