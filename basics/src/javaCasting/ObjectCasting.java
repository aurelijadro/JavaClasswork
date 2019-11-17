package javaCasting;

public class ObjectCasting {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();

		animal.eat();
		dog.bark();
		dog.eat();

		// Upcasting:

		Animal otherAnimal = new Dog();
		otherAnimal.eat();
		// can't bark!

		// Downcasting: (labai pavojingas!)

		Dog otherDog = (Dog) otherAnimal; // (not safe conversion)
		otherDog.bark();
		otherDog.eat();

		// Primitive types casting:
		// implicit casting (pleciam diapazona):
		byte byteNum = 25;
		short shortNum = byteNum; // safe conversion
		double doubleNum = shortNum; // safe conversion

		// explicit casting:
		byte number = (byte) doubleNum; // not safe conversion

	}
}
