package shopping;

public class ShoppingCart {
	
	private ShoppingCartItems[] items = new ShoppingCartItems[3];
	
	public void  add(ShoppingCartItems item) {
		items[0]=item;
	}
	
	public double getTotalPrice() {
		for(ShoppingCartItems item : items) {
			
		}
		return 0;
	}
}
