package practice;

import java.util.Scanner;

public class Square {

	public static double calculateArea(double side) {
		return Math.pow(side, 2);
	}
	
	public static double calculatePerimeter(double side) {
		return 4*side;
	}
	
	public static double getSideLength() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the side length of the square:");
		if(scan.hasNextDouble()) {
			double side= Double.parseDouble(scan.next());
			return side;
			}
	
		return Square.getSideLength();
		
	}
	
	public static void printAreaAndPerimeterCalculations() {
		double side = Square.getSideLength();
		System.out.println("Perimeter of your square is:" + Square.calculatePerimeter(side));
		System.out.println("Area of your square is:" + Square.calculateArea(side));
	}
}
