package practice;

public class MinAndMax {

	public static void printMinAndMax() {
		System.out.println("\n\nMin and Max values of different Java types:");
		System.out.printf("%-7s %-20s %-20s %n","", "MIN", "MAX");
		System.out.printf("%-7s %-20s %-20s %n","BYTE", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("%-7s %-20s %-20s %n","SHORT", Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("%-7s %-20s %-20s %n","INT", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("%-7s %-20s %-20s %n","LONG", Long.MIN_VALUE, Long.MAX_VALUE);
	}
}
