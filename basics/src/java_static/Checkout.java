package java_static;

public class Checkout {

	public static void main(String[] args) {
		People unit1 = new People("Tomas", 25);
		People unit2 = new People("Tadas", 22);

		unit1.getName();
		unit1.getAge();

		unit2.getName();
		unit2.getAge();

		System.out.println(unit1.getName() + " " + unit1.getAge());
		System.out.println(unit1.description);
		unit1.description = "Unicorn unit";
		System.out.println(unit1.description);
		System.out.println(unit2.getName() + " " + unit2.getAge());
		System.out.println(unit2.description);

		// unit1.talk();
		People.talk();

	}

}
