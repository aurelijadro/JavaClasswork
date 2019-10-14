package students;

public class Student {
	String name;
	int age;
	boolean isFailing;
	
	public Student(String name, int age, boolean isFailing) {
		this.name = name;
		this.age = age;
		this.isFailing = isFailing;
	}

	@Override
	public String toString() {
		return "[Student " + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isDebt() {
		return isFailing;
	}

	public void setDebt(boolean debt) {
		this.isFailing = debt;
	}
	
	
	
	
}
	
