package input_output;

import java.io.File;
import java.io.IOException;

public class JavaFile {
	public static void main(String[] args) {

		try {
			createNewFile();
			createNewDirectory();
			createNewDirectories();
			deleteFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void deleteFile() {
		File fileToDelete = new File("Hello.txt");
		boolean checkIfFileDeleted = fileToDelete.delete();
		System.out.println("File deleted: " + checkIfFileDeleted);
	}

	private static void createNewDirectories() {
		File newDirectories = new File("MyFolder/A/B/C");
		boolean checkDirectoriesCreated = newDirectories.mkdirs();
		System.out.println("New directories creater: " + checkDirectoriesCreated);
	}

	private static void createNewDirectory() {
		File newDirectory = new File("MyFolder");
		boolean checkDirectoryCreated = newDirectory.mkdir();
		System.out.println("New directory creater: " + checkDirectoryCreated);
	}

	private static void createNewFile() throws IOException {
		File newFile = new File("Hello.txt");
		boolean checkCreateNewFile = newFile.createNewFile();
		System.out.println("File creater: " + checkCreateNewFile);

	}
}
