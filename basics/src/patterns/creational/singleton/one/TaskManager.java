package patterns.creational.singleton.one;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

	public static void main(String[] args) {
		PrintSpooler printSpooler1 = PrintSpooler.getInstance();
		PrintSpooler printSpooler2 = PrintSpooler.getInstance();
		
		System.out.println(printSpooler1);
		System.out.println(printSpooler2);
		
		printSpooler1.start();
		
		List<String> names = new ArrayList<String>();
		names.add("Laura");
		names.add("Linda");
		
		printSpooler2.print(names);
		
	}

}
