package anonymous;

public class RealAnimal extends Animal implements AbleToEat {

	public RealAnimal(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Real animal says niam niam");
		
	}
	
}
