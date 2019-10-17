package practice;

import java.util.Scanner;

public class Factorial {
	public static int countFactorial(int num) {
		int factorial = 1;

		if (num > 0) {
			for (int i = num; i > 0; i--) {
				factorial *= i;
			}
			return factorial;
		}
		return 0;
	}
	
	public static int getNumber() {
		Scanner scn = new Scanner(System.in);
		System.out.println("To count factorial please enter a positive number:");
		if(scn.hasNextInt()){
			int num =Integer.parseInt(scn.next());
			if (num >=0) {
				return num;
			}
			else {
				System.out.println("please enter a positive number!");
				return getNumber();
			}
		} else {
			return getNumber();
		}
		
	}
	
	public static void printFactorialValue() {
		System.out.println("Factorial is:"+Factorial.countFactorial(Factorial.getNumber()));
	}

}
