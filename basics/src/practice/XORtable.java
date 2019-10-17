package practice;

public class XORtable {
	
	public static void printTable() {
		
		String heading = "XOR truth table:";
		String a = "a";
		String b = "b";
		String ab = "a^b";
		String status1 = "true";
		String status2 = "false";
		System.out.println(heading);
		System.out.println(a + "\t"+ b+ "\t"+ ab);
		System.out.println(status2 + "\t"+ status2+ "\t"+ status2);
		System.out.println(status2 + "\t"+ status1+ "\t"+ status1);
		System.out.println(status1 + "\t"+ status2+ "\t"+ status1);
		System.out.println(status1 + "\t"+ status1+ "\t"+ status2);
		
	}
	
}
