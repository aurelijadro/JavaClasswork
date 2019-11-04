package patterns.creational.builder.four;

public class Website {
	
	private String title;
	private Cms cms;
	private int price;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCns(Cms cms) {
		this.cms = cms;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Website [title=" + title + ", cns=" + cms + ", price=" + price + "]";
	}
	
	
}
