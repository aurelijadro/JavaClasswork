package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("data.bin");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person person1 = (Person) ois.readObject();
			Person person2 = (Person) ois.readObject();
			Person person3 = (Person) ois.readObject();
			System.out.println(person1);
			System.out.println(person2);
			System.out.println(person3);

			Person[] people = (Person[]) ois.readObject();
			System.out.println(Arrays.toString(people));

		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}

	}
}
