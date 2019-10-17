package shopping;

public class Press extends AbstractProduct implements ShoppingCartItems{
	private static final double PRESS_VAT=1.09;

	public Press(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getVAT() {
		// TODO Auto-generated method stub
		return PRESS_VAT;
	}

}
