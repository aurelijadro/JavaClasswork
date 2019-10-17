package abstraction;

public class Fish extends Animal implements Info{

	public Fish(String name, long id) {
		super(name, id);
	}

	@Override
	public void makeSound() {
		System.out.println("Blup, blup blup");

	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
	}

}
