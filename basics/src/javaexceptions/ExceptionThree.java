package javaexceptions;

import java.util.Scanner;

public class ExceptionThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {

			String string = input.nextLine();
			if (!string.contentEquals("Penktadienis")) {
				try {
					throw new PenktadienisException("Penktadienis was expected");

				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
