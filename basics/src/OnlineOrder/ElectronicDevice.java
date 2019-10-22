package OnlineOrder;

public abstract class ElectronicDevice {
	String title;
	double price;
	int quantity;
	
	
	public ElectronicDevice(String title, double price, int quantity) {
		super();
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}


	public String getTitle() {
		return title;
	}


	public double getPrice() {
		return price;
	}


	public int getQuantity() {
		return quantity;
	}
	
	
	
	
}
