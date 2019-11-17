package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args) {
		Person person1 = new Person(1, "Kate", " surname", 25);
		Person person2 = new Person(2, "Anna", "suename ", 11);
		Person person3 = new Person(3, "Jazminne", " surname", 22);

		Person[] people = { person1, person2, person3 };

		try (FileOutputStream fos = new FileOutputStream("data.bin");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(person1);
			oos.writeObject(person2);
			oos.writeObject(person3);
			oos.writeObject(people);

		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

}
