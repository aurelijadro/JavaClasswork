package patterns.structural.decorator.one;

public class BaseCar implements Car {

	@Override
	public int getPrice() {
		
		return 20000;
	}

	@Override
	public String getCarDescription() {
		
		return "A car to ride around town";
	}

	
	public String toString() {
		return "BaseCar [getPrice()=" + getPrice() + ", getCarDescription()=" + getCarDescription() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
