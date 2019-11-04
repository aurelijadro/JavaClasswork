package patterns.creational.singleton.one;

import java.util.List;

public class PrintSpooler {
	
	private static final PrintSpooler PRINT_SPOOLER = new PrintSpooler();
	private static boolean initialized = false;
	
	private PrintSpooler() {}
	
	public void start () {
		System.out.println("Spooler initialized....");
	}
	
	public static PrintSpooler getInstance() {
		if (!initialized) {
			PRINT_SPOOLER.start();
			initialized = true;
		}
		return PRINT_SPOOLER;
	}
	
	public void print(List<String> list) {
		System.out.println("Printing....");
		System.out.println(list);
	}
	
	

}
