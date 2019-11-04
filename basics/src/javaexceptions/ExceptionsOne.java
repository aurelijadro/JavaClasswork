package javaexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsOne {
	public static void main(String[] args) {
		runner(); // apdoroti klaidas turi tas, kas pasaukia
		readFromFile();

	}

	public static void runner() {
		try {
			Scanner input = new Scanner(System.in);
			int num = input.nextInt(); // kaip ispresti problema?
			System.out.println("Program smth...");
		} catch (InputMismatchException ex) {
			System.out.println("Wrong input typed");
			ex.printStackTrace(); // atspausdint visa diagnostine info, kas mano
			// programoje suluzo
		}
	}

	public static void readFromFile() {
		try {
		File file = new File("Test.txt");
		Scanner readFile = new Scanner(file);
		} catch  (FileNotFoundException ex){
			System.out.println("File not found... " + ex );
		}
	}
}
