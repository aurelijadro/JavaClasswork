package interfaceExampleFour;

public class Point extends CoordinateAxis implements Movable {

	private int positionX;
	private int positionY;

	public Point(int positionX, int positionY) {
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
