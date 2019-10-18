package InterfaceExampleThree;

public class Circle extends Shape{ //isipareigoja ivykdyti interface metodus
	
	private double radius;
		
	public Circle(double radius) {
	super();
	this.radius = radius;
}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}

	@Override
	public boolean paint() {
		return true;
	}
	
	public void printPerimeter() {
		System.out.println(this.getPerimeter());
	}

	@Override
	public double calculateAmmountOfPaintNeeded() {
		// TODO Auto-generated method stub
		return 0;
	}

}
