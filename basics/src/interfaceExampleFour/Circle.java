package interfaceExampleFour;

public class Circle extends CoordinateAxis{
	private int radius;
	private int centerX;
	private int centerY;
	
	public Circle(int radius, int centerX, int centerY) {
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
	}

	public int getRadius() {
		return radius;
	}

	public int getCenterX() {
		return centerX;
	}

	public int getCenterY() {
		return centerY;
	}
	
	
}
