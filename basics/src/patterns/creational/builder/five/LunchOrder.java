package patterns.creational.builder.five;

public class LunchOrder {
	private Bread bread;
	private Meat meat;
	private Butter butter;
	private Coffee coffee;

	public LunchOrder(LunchBuilder lunchBuilder) {
		this.bread = lunchBuilder.getBread();
		this.meat = lunchBuilder.getMeat();
		this.butter = lunchBuilder.getButter();
		this.coffee = lunchBuilder.getCoffee();

	}

	@Override
	public String toString() {
		double check = 0.0;
		StringBuilder build = new StringBuilder();
		if (bread != null) {
			build.append("Bread=" + bread.getName() + "\n");
			check += bread.getPrice();
		}
		if (meat != null) {
			build.append("Meat=" + meat.getName() + "\n");
			check += meat.getPrice();
		}
		if (butter != null) {
			build.append("Butter=" + butter.getName() + "\n");
			check += butter.getPrice();
		}
		if (coffee != null) {
			build.append("Coffee=" + coffee.getName() + "\n");
			check += coffee.getPrice();
		}
		build.append("Check:" + check + "Eur\n");
		return build.toString();
	}

}
