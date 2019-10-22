package GeometricObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizableCircle circle = new ResizableCircle(5);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
		
		circle.resize(2);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
	}

}
