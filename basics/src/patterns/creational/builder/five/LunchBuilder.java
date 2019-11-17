package patterns.creational.builder.five;

public class LunchBuilder { // builderis reikalingas formuoti skirtingiems uzsakymams
	private Bread bread;
	private Meat meat;
	private Butter butter;
	private Coffee coffee;

	public LunchBuilder() {
	}

	public LunchOrder build() {
		return new LunchOrder(this);
	}

	public LunchBuilder bread(Bread bread) {
		this.bread = bread;
		return this;
	}

	public LunchBuilder meat(Meat meat) {
		this.meat = meat;
		return this;
	}

	public LunchBuilder butter(Butter butter) {
		this.butter = butter;
		return this;
	}

	public LunchBuilder coffee(Coffee coffee) {
		this.coffee = coffee;
		return this;
	}

	public Bread getBread() {
		return bread;
	}

	public Meat getMeat() {
		return meat;
	}

	public Butter getButter() {
		return butter;
	}

	public Coffee getCoffee() {
		return coffee;
	}

}