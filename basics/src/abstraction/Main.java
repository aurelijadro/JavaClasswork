package abstraction;

public class Main {

	public static void main(String[] args) {
		Fish fish = new Fish("Jesie", 123456789);
		fish.makeSound();
		Info cow = new Cow("Anabelle", 987654321);
		//cow.makeSound();
		Info unit1  = new People ("Bob", 33);
		cow.getInfo();
		unit1.getInfo();
		
		Info[] info = {new Cow("Anabelle", 987654321), new People ("Bob", 33)};
	}

}
