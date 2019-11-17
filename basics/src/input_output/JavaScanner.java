package input_output;

import java.util.Scanner;

public class JavaScanner { // perziureti package.java.io
	public static void main(String[] args) {
		// !bad practice:
		// try {
		Scanner input = new Scanner(System.in);
		System.out.println("lan");
		String data = input.next();
		System.out.println(data.length());
//		} catch (Exception ex) {
//			System.out.println(ex);
//		}

	}
}
