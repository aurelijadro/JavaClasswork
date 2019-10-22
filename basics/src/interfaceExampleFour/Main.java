package interfaceExampleFour;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(10, 0, 0);
		Point point = new Point(10, 0);
		System.out.println(point.toString());
		System.out.println(CoordinateAxis.pointBelongsToCircle(point, circle));
		CoordinateAxis.movePointDownInsideACircle(point, circle);
		System.out.println(point.toString());
		CoordinateAxis.movePointLeftInsideACircle(point, circle);
		System.out.println(point.toString());
		CoordinateAxis.movePointUpInsideACircle(point, circle);
		System.out.println(point.toString());
		CoordinateAxis.movePointRightInsideACircle(point, circle);
		

	}

}
