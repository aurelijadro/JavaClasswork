package input_output;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class JavaInputStream {
	public static void main(String[] args) {

		readTextFile();

		// readFileWithCharBasedStream();
		// java.nio paketas

	}

	private static void readTextFile() {
		try (InputStream is = new FileInputStream("test.txt")) { // i byte netelpa lietuviskos raides ir kiti ypatingi
																	// simboliai use file reader
			int byteNumber = 0;
			while ((byteNumber = is.read()) != -1) {
				char chars = (char) byteNumber;
				System.out.print(chars);
			}
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

	private static void readTextFile2() {
		try (BufferedReader inputStream = new BufferedReader(new FileReader("test.txt"));
				PrintWriter outputStream = new PrintWriter(new FileWriter("copyTest2.txt"))) {
			String dataBox;
			while ((dataBox = inputStream.readLine()) != null) {
				System.out.println(dataBox);
				outputStream.println(dataBox);
			}

		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

}
