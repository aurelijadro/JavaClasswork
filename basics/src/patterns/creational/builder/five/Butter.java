package patterns.creational.builder.five;

public class Butter implements Menu {
	private String title;
	private double price;

	public Butter() {
		this.title = "Butter";
		this.price = 0.5;
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
