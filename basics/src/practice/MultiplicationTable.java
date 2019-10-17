package practice;

public class MultiplicationTable {
	
	public static void printMultiplicationTable() {
		System.out.println("******************************************Multiplication Table*********************************************");
		for (int i=1; i<=10; i++) {
			for (int z=1; z<=10; z++) {
				int mult=i*z;
				System.out.printf("%-10s","|"+i+"x"+z+"="+mult+"| ");
			}
			System.out.println();
		}
	}

}
