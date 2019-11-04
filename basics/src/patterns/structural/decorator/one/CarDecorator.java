package patterns.structural.decorator.one;

public class CarDecorator implements Car{
	
	protected final Car car;
	
	public CarDecorator (Car car) {
		this.car = car;
	}
	

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return car.getPrice();
	}


	@Override
	public String getCarDescription() {
		// TODO Auto-generated method stub
		return car.getCarDescription();
	}


	@Override
	public String toString() {
		return "CarDecorator [car=" + car + ", getPrice()=" + getPrice() + ", getCarDescription()="
				+ getCarDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
}
