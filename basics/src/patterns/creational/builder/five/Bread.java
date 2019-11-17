package patterns.creational.builder.five;

public class Bread implements Menu {

	private String title;
	private double price;

	public Bread(String title, double price) {
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
