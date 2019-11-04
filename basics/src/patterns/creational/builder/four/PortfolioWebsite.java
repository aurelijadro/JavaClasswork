package patterns.creational.builder.four;

public class PortfolioWebsite extends WebsiteBuilder {

	@Override
	void buildName() {
		System.out.println("Portflio website");
		
	}

	@Override
	void buildCms() {
		System.out.println(Cms.WORDPRESS);
		
	}

	@Override
	void buildPrice() {
		System.out.println(100);
		
	}

	@Override
	public String toString() {
		return "PortfolioWebsite [website=" + website + ", getWebsite()=" + getWebsite() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
