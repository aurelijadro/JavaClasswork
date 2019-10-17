package practice;

import java.util.Scanner;

public class Parabola {
	
	public static double getUserInputForSquareFunction() {
		System.out.println("Please enter a valid number:");
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextDouble()) {
			double parameter= Double.parseDouble(scan.next());
			return parameter;
			}
	
		return Parabola.getUserInputForSquareFunction();
		
	}
	
	public static double calculteX0(double b, double a) {
		return b/-2*a;
	}
	
	public static double calculateY0(double a, double b, double c, double x0) {
		
		return a*Math.pow(x0, 2)+b*x0+c-x0;
	}
	
	public static double[] getParametersOfSquareFunction() {
		double [] parameters = new double [3];
		System.out.println("Enter a of your square function, a!=0");
		parameters[0] = Parabola.getUserInputForSquareFunction();
		System.out.println("Enter b of your square function");
		parameters[1]=Parabola.getUserInputForSquareFunction();
		System.out.println("Enter c of your square function");
		parameters[2]=Parabola.getUserInputForSquareFunction();
		return parameters;		
	}
	
	public static void printVertexCoordinates() {
		double [] parameters = Parabola.getParametersOfSquareFunction();
		double x0 = Parabola.calculteX0(parameters[1], parameters[0]);
		double y0 = Parabola.calculateY0(parameters[0], parameters[1], parameters[2], x0);
		System.out.println("Calculated vertex coordinates are [" + x0 +","+y0+"].");
	}
}
