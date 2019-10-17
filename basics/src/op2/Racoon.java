package op2;

public class Racoon extends Animal2 {

	public Racoon(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println("Racoon is full :)");
	}
	
	public void sneak() {
		System.out.println("Sneaky, sneaky, rocoonny");
	}

}
