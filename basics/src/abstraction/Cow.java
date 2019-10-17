package abstraction;

public class Cow extends Animal implements Info {

	public Cow(String name, long id) {
		super(name, id);
		
	}

	@Override
	public void makeSound() {
		System.out.println("Mooo");
		
	}

	@Override
	public void getInfo() {
		System.out.println("Name: " + this.name + " ID: "+ this.id);
		
	}

	
	
}
