package nestedclasses;

public class Testing {

	public static void main(String[] args) {
		
		Car car = new Car ("Opel", 123456);
		car.start();
		
		Car.Battery battery = new Car.Battery();
		battery.charge(); // statines vidines klases panaudojimas
		
	}

}
