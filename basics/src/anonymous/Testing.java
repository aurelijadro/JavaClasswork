package anonymous;

public class Testing {

	public static void main(String[] args) {
		Animal animal = new RealAnimal("Animal");
		animal.eat();
		Penguin penguin = new Penguin("Peng");
		penguin.eat();
		Animal otherAnimal = new Animal("Tadas") { // sukuriama anoniminė klasė
			@Override
			public void eat() {
				System.out.println("Anonymous animal can eat");
			}
		};

		otherAnimal.eat();

		AbleToEat newAnimal = new AbleToEat() { // anonimine klase
			@Override
			public void eat() {
				System.out.println("Om niom");
			}
		};

		newAnimal.eat();

	}

}
