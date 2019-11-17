package input_output;

public class JavaFileReadingWithScannerTester {
	public static void main(String[] args) {
		ReadFileWithScanner reader = new ReadFileWithScanner("test.txt");
		System.out.println(reader.getFileLine());

	}

}