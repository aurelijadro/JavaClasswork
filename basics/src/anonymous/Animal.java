package anonymous;

public abstract class Animal {

	String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public void eat() {
		System.out.println("Niam niam niam");

	}

	public void sleep() {
		System.out.println("Zzzz Zzzz Zzzz");
	}

}
