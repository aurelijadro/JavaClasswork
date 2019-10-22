package OnlineOrder;

public class Pizza extends Food implements Deliverable, Orderable {
	
	double deliveryPrice = 5.25;

	public Pizza(String title, double price, int quantity) {
		super(title, price, quantity);
	}

	@Override
	public boolean isDeliverable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double calculateDeliveryPrice() {
		if (this.getPrice()*this.quantity > 50){
			return 0;
		}
		return 5;
	}

	@Override
	public double calculateOrderPrice() {
		return this.price*this.quantity;
		
	}
	
	
}
