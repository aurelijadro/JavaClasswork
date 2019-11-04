package patterns.creational.builder.four;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		director.setWebsiteBuilder(new PortfolioWebsite());
		Website website = director.buildWebsite();

	}

}
