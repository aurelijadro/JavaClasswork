package patterns.structural.decorator.one;

public class HeatingSeats extends CarDecorator{

	public HeatingSeats(Car car) {
		super(car);
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice()+2000;
	}

	@Override
	public String getCarDescription() {
		// TODO Auto-generated method stub
		return super.getCarDescription()+" heating seats";
	}

	@Override
	public String toString() {
		return "HeatingSeats [car=" + car + ", getPrice()=" + getPrice() + ", getCarDescription()="
				+ getCarDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
