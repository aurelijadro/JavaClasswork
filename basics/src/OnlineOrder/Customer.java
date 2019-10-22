package OnlineOrder;

public class Customer extends Human {
	
	Orderable[] order;
	

	public Customer(String name, Orderable[] order) {
		super(name);
		order = this.order;
		
	}

}
