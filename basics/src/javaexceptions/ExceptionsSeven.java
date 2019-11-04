package javaexceptions;

import java.io.IOException;

public class ExceptionsSeven {

	public static void main(String[] args) {

		exception();

	}

	private static void exception() {
		try {
			try {
				throw new Exception("1");
			} finally {
				if (true) {
					throw new Exception("2");
				}

				System.err.println("3");
			}
		} catch (IOException ex) {
			System.err.println("4");
		} catch (Exception ex) {
			System.err.println("5");
		} finally {
			System.out.println("6");
		}
	}

}
