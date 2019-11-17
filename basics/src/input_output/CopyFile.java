package input_output;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFile {
	public static void main(String[] args) {
		// copyByteByByte();
		// copyCharByChar();
		copyLineByLine();
	}

	private static void copyLineByLine() {
		try (BufferedReader inputStream = new BufferedReader(new FileReader("test.txt"));
				PrintWriter outputStream = new PrintWriter(new FileWriter("copyV2Test.txt"));) {
			String dataBox;
			while ((dataBox = inputStream.readLine()) != null) {
				outputStream.println(dataBox);
			}
			outputStream.flush();

		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

	private static void copyCharByChar() {
		try (FileReader fr = new FileReader("test.txt"); FileWriter fw = new FileWriter("copyTest.txt")) {
			int dataBox;
			while ((dataBox = fr.read()) != -1) {
				System.out.println((char) dataBox);
				fw.write(dataBox);
			}

		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

	private static void copyByteByByte() {
		try (FileInputStream fis = new FileInputStream("cactus.jpg");
				FileOutputStream fos = new FileOutputStream("newpic.jpg")) {
			int dataBox;
			while ((dataBox = fis.read()) != -1) {
				fos.write(dataBox);

			}
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

}
