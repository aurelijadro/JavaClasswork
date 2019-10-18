package shopping;

public class ShoppingCart {
	
	private AbstractProduct[] items = new  AbstractProduct[3];
	private int counter =0;
	
	public void  add(AbstractProduct item) {
		items[counter]=item;
		counter++;
	}
	
	public double getTotalPrice() {
		double total =0;
		for( AbstractProduct item : items) {
			total+=item.getPriceWithVAT();
		}
		return total;
	}
}
