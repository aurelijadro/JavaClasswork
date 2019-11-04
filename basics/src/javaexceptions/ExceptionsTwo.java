package javaexceptions;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionsTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {

			int num = Integer.parseInt(input.nextLine());
			if (num != 0) {
				try {
					// throw new IOException();
					throw new ScannerException("Wrong input typed!");
					// } catch (IOException ex) {
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}
