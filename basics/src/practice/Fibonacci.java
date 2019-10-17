package practice;

public class Fibonacci {
	
	public static void printFibonacciNumsLessThan(int num) {
		int fibonacciNum =1;
		int prev=0;
		int next =1; 
		System.out.print("Fibonacci sequence up to " + num + ": "+ 0+ " ");
		while(fibonacciNum<num) {
			System.out.print(fibonacciNum+" ");
			fibonacciNum= prev+next;
			prev = next;
			next = fibonacciNum;
			
		}
		System.out.println();
	}

}
