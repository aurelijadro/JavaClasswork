package patterns.creational.builder.four;

public class LandingPage extends WebsiteBuilder {

	@Override
	void buildName() {
		System.out.println("Landing Page");
		
	}

	@Override
	void buildCms() {
		System.out.println(Cms.LARAVELL);
		
	}

	@Override
	void buildPrice() {
		System.out.println(500);
		
	}

}
