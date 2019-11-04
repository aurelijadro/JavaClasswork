package javaexceptions;

import java.io.File;
import java.util.Scanner;

public class ExceptionsFour {

	public static void main(String[] args) {
		// 1.checked exception (Compiler exceptions)
		// 2.unchecked exceptions (Runtime exceptions)

		File file = new File("Test.txt"); // 1. FileNotFound exception
		// Scanner readFile = new Scanner(file); // butina apdoroti!
		// int num =10/0; // 2. DivideByZero exception // negalima leisti tokioms
		// klaidoms programoje ivykti - reikia apdoroti ne kode, o logikoje

		// divideNumbers(10,0); //2

		String name = null; // 2
		// System.out.println(name.length());

		int[] numbers = new int[2]; // 2
		System.out.println(numbers[2]);

	}

	public static void divideNumbers(int num1, int num2) {
		if (num2 == 0) {
			throw new ArithmeticException("Number can't be zero!");
		}
	}

}
