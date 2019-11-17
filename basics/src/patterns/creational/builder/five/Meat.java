package patterns.creational.builder.five;

public abstract class Meat implements Menu {

	private String type;
	private double price;

	public Meat(String type, double price) {
		this.type = type;
		this.price = price;
	}

	@Override
	public String getName() {
		return this.type;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

}
