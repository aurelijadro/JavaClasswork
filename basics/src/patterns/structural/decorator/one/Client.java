package patterns.structural.decorator.one;

public class Client {

	public static void main(String[] args) {
		Car car = new HeatingSeats(new BaseCar());
		System.out.println(car);

	}

}
