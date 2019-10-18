package InterfaceExampleThree;

public class Rectangle extends Shape{
	
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.height*this.width;
	}

	
	@Override
	public double getPerimeter() {
		return 2*this.height+2*this.width;
	}

	@Override
	public boolean paint() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double calculateAmmountOfPaintNeeded() {
		// TODO Auto-generated method stub
		return 0;
	}

}
