package interfaceExampleFour;

public class Point extends CoordinateAxis implements Movable {

	private int positionX;
	private int positionY;

//	public Point(int positionX, int positionY, Circle circle) {
//		if(Math.pow(circle.getRadius(),2)>=Math.pow(positionX-
//				circle.getCenterX(), 2)+Math.pow(positionY-circle.getCenterY(), 2)) {
//			this.positionX = positionX;
//			this.positionY = positionY;
//			System.out.println("Point inside the circle!");
//		}else {
//			System.out.println("Point outside the circle!");
//		}
//		
//	}
	
	public Point(int positionX, int positionY) {
		// check if coordinates fit in circle
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	
	public Point(int positionX, int positionY, Circle circle) {
		// check if coordinates fit in circle
		this.positionX = positionX;
		this.positionY = positionY;
	}

	@Override
	public void moveUp() {
		this.positionY++;

	}

	@Override
	public void moveDown() {
		this.positionY--;

	}

	@Override
	public void moveLeft() {
		this.positionX--;

	}

	@Override
	public void moveRight() {
		this.positionX++;

	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	@Override
	public String toString() {
		return "Point [positionX=" + positionX + ", positionY=" + positionY + "]";
	}

}
