package patterns.creational.builder.five;

public class Client {

	public static void main(String[] args) {
		LunchOrder myLunch = new LunchBuilder().bread(new BreadVilniausDuona()).meat(new Pork())
				.coffee(new Cappuccino()).build();
		System.out.println(myLunch);
	}

}
