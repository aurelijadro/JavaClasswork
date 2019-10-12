package op;

public class Admin {

	public static void main(String[] args) {
		Human human1 = new Human("Tomas", 1.85, 90.2);
		BMI result = new BMI(human1.getHeight(), human1.getWeight());
		System.out.println(human1.getName() + " has a BMI of: " + result.printBMI());

		BMIdataList data = new BMIdataList();

		data.updateBMIdataList(human1.getName(), result.printBMI());
		data.updateBMIdataList("Petras", "13.0");
		System.out.println(data.getBMIByName(human1.getName()));
		System.out.println(data.getBMIByName("Jonas"));
		;
		data.getAllData();
	}

}
