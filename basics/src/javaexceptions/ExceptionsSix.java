package javaexceptions;

import java.util.Scanner;

public class ExceptionsSix {

	public static void main(String[] args) {

		String text = "Java ....";
		getStringSize(text);
		getStringSize(null);

	}

	private static int getStringSize(String text) {
		Scanner input = new Scanner(System.in);
		try {
			input.close();
			input.hasNext(); //java.lang.IllegalStateException: Scanner closed
			System.out.println("Try Block");
			return text.length();

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Catch Block");
			// System.exit(-1);
			return -1;
		} finally { // finally visada vykdomas nebnet naudojamas System.exit(-1);
			System.out.println("Finally Block");
			input.close(); // scaner'is uzsidaro automatiskai - nereikia jo uzdarineti
			return 0;
		}

	}

}
