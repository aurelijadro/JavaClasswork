package interfaceExampleFour;

public class CoordinateAxis {
	public static boolean pointBelongsToCircle (Point point, Circle circle) {
		if(Math.pow(circle.getRadius(),2)>=Math.pow(point.getPositionX()-
				circle.getCenterX(), 2)+Math.pow(point.getPositionY()-circle.getCenterY(), 2)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void movePointUpInsideACircle(Point point, Circle circle) {
		Point futurePoint = point;
		futurePoint.moveUp();
		if (CoordinateAxis.pointBelongsToCircle(futurePoint, circle)) {
			point.moveUp();
			System.out.println("Point moved up!");
		}
		else {
			System.out.println(("Point can't move outside of the circle!"));
		}
	}
	
	public static void movePointDownInsideACircle(Point point, Circle circle) {
		Point futurePoint = point;
		futurePoint.moveDown();
		if (CoordinateAxis.pointBelongsToCircle(futurePoint, circle)) {
			point.moveDown();
			System.out.println("Point moved down!");
		}
		else {
			System.out.println(("Point can't move outside of the circle!"));
		}
	}
	
	public static void movePointRightInsideACircle(Point point, Circle circle) {
		Point futurePoint = point;
		futurePoint.moveRight();
		if (CoordinateAxis.pointBelongsToCircle(futurePoint, circle)) {
			point.moveRight();
			System.out.println("Point moved down!");
		}
		else {
			System.out.println(("Point can't move outside of the circle!"));
		}
	}
	
	public static void movePointLeftInsideACircle(Point point, Circle circle) {
		Point futurePoint = point;
		futurePoint.moveLeft();
		if (CoordinateAxis.pointBelongsToCircle(futurePoint, circle)) {
			point.moveLeft();
			System.out.println("Point moved down!");
		}
		else {
			System.out.println(("Point can't move outside of the circle!"));
		}
	}
}
