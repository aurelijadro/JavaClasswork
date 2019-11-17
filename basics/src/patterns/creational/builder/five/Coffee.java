package patterns.creational.builder.five;

public class Coffee implements Menu {

	private String title;
	private double price;

	public Coffee(String title, double price) {
		this.title = title;
		this.price = price;
	}

	@Override
	public String getName() {
		return this.title;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
