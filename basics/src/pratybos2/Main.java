package pratybos2;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 10.5;
		double b = 4;
		double gravitacija = 0.62; // plutone
		double sunkioJega = 0;
		String[] names = { "Hermione", "Harry", "Ron", "Alisenta", "Peeve" };
		int[] ints = new int[30];
		fillWithNums(ints);
		System.out.println(ints);
		pratybos1();
		pratybos2();
		pratybos3();
		pratybos4();
		pratybos5();
		pratybos6(a, b); // calculate area and perimeter of rectangle
		pratybos7(); // pi with 7 digits after .
		// pratybos8(sunkioJega, gravitacija);
		pratybos9(100); // farenheit to celcius
		pratybos10();
		pratybos12(names);
		pratybos13(ints);
	}

	public static void pratybos1() {
		System.out.println("Pratybos 1:\n");
		for (int i = 0; i < 3; i++) {
			System.out.println("*****");
		}

	}

	public static void pratybos2() {
		System.out.println("Pratybos 2:\n");
		for (int i = 0; i < 5; i++) {
			System.out.println("****");
		}
	}

	public static void pratybos3() {
		System.out.println("Pratybos 3:\n");
		for (int i = 0; i < 4; i++) {
			if (i == 0 || i == 3) {
				System.out.println("*****");
			} else {
				System.out.println("*   *");
			}
		}
	}

	public static void pratybos4() {
		System.out.println("Pratybos 4:\n");
		for (int i = 0; i < 5; i++) {
			for (int z = 0; z <= i; z++) {
				if (z == 0 || z == i) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("*********");
	}

	public static void pratybos5() {
		System.out.println("Pratybos 5:\n");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				if ((j == 4 - i) || (j == 4 + i) || i == 3) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();

		}
	}

	public static void pratybos6(double a, double b) { // calculate area and perimeter of rectangle
		System.out.println("Pratybos 6:\n");
		double perimeter = 2 * a + 2 * b;
		double area = a * b;
		System.out.println("Area of rectangle is " + area + ", perimeter is " + perimeter);
	}

	public static void pratybos7() {

		System.out.printf("PI = %.7f\n", Math.PI);
	}

//	public static void pratybos8() {
//		// kuno mase m=sunkiojega/gravitacija
//	}

	public static void pratybos9(double temperatureInFarenheit) {
		System.out.println("Pratybos 9:\n");
		System.out.printf(temperatureInFarenheit + "farenheit = %.2f celcius\n",
				((temperatureInFarenheit - 32) * 5 / 9));
	}

	public static void pratybos10() {
		System.out.println("Pratybos 10:\n");
		int[] nums = new int[20];
		nums = fillWithNums(nums);
		Arrays.sort(nums);
		int sum = sumArrayInts(nums);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(nums));
		System.out.println("Sum of all array elements is: " + sum);

	}

	public static int[] fillWithNums(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		return array;
	}

	public static int sumArrayInts(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}

	public static void pratybos12(String[] names) {
		System.out.println("Pratybos 12:\n");
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

	}

	public static void pratybos13(int[] ints) {
		System.out.println("Pratybos 13: \n");
		// count unique numbers:
		Arrays.sort(ints);
		int uniqueNumCount = 1;
		int[] uniqueNums = {ints[0]};
		int[] tmp = new int[0];
		for (int i =1; i<ints.length; i++) {
//			if (ints[i]!=ints[i-1]) {
//				uniqueNumCount++;
//				tmp = uniqueNums;
//				uniqueNums= new
//			}
		}
		
		

}
}
