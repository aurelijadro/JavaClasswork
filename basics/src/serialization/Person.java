package serialization;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -6616339217635248088L;
	private int id;
	private String name;
//	private transient String name; // transient savybe nebus serializuojama ir irasoma
	private String surname;
	private int age;

	public Person(int id, String name, String surname, int age) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.id + " : " + this.name + " " + this.surname;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
