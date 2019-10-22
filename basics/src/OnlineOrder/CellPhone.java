package OnlineOrder;

public class CellPhone extends ElectronicDevice implements Deliverable, Orderable{

	public CellPhone(String title, double price, int quantity) {
		super(title, price, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateOrderPrice() {
		if (this.getPrice() > 150){
			return 0;
		}
		return 10;
	}

	@Override
	public boolean isDeliverable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double calculateDeliveryPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
