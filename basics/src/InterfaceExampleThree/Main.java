package InterfaceExampleThree;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(12.0);
		Rectangle rectangle = new Rectangle (2, 3);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
		
		Shape [] shapes = new Shape[0];
		Paintable [] pp = {new Circle(12.0), new Rectangle(12, 6)};
		
		pp[0].paint();
	}
}
