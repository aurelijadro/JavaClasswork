package input_output;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileWithScanner {

	private String path;
	private File fileObject;
	private Scanner readFile;

	/**
	 * 
	 * @param path can generate NullPointerException
	 */

	public ReadFileWithScanner(String path) {
		if (path != null) {
			this.fileObject = new File(path);
			readDataFromFile();
		} else {
			throw new NullPointerException();
		}

	}

	private void readDataFromFile() { // butina naudoti try catch!
		try {
			this.readFile = new Scanner(fileObject);
		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

	public String getFileLine() {
		return readFile.nextLine();
	}

}
