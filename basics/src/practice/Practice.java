package practice;

import java.util.Arrays;

public class Practice {
	public static void main(String[] args) {
		JavaIntroduce.introduce();

		char[] hello = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!' };
		CharArrayToString.printString(CharArrayToString.arrayToString(hello));

		char[] data = { 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g' };
		CharArrayToString.printString(CharArrayToString.toUpperCase(CharArrayToString.arrayToString(data)));

		CharArrayToString.printString(CharArrayToString.backwards(data));

		String weirdString = ").cte ,iP yrrebpsaR ,xuniL ,caM ,swodniW( smroftalp tnereffid no skrow avaJ";
		
		CharArrayToString.printString(CharArrayToString.backwards(weirdString.toCharArray()));
		
		XORtable.printTable();
		
		String str = "A\240b3&4\040";
		System.out.println(str);
		System.out.println(Arrays.toString(str.toCharArray()));
		StringToChars.printCharTable(str);
		MinAndMax.printMinAndMax();
		
		String str1 = "String changer.";
		//System.out.println(StringChanger.stringToBinary("String changer.")); not done (9)
		StringChanger.stringToBinary(str1);
		
		byte [] secretMessage = {84, 104, 101, 32, 98, 101, 115, 116, 32, 112, 97,
				115, 115, 119, 111, 114, 100, 32, 109, 97, 110, 97, 103, 101, 114, 115, 32, 102, 111, 114, 32, 50, 48,
				49, 57};
		
		System.out.println(BytesToString.bytesToString(secretMessage));
		
		//Square.printAreaAndPerimeterCalculations();
		//Parabola.printVertexCoordinates();
		System.out.println(Names.defineGender("Aloyzas"));
		System.out.println(Names.defineGender("Gerda"));
		
		//DayOfWeek.printDayOfWeek("2019-10-17"); not done(14)
		
		Fibonacci.printFibonacciNumsLessThan(1000);
		
		System.out.println(CrazyMath.crazySum(2, -5));
		System.out.println(CrazyMath.crazySquare(9));
		System.out.println(Palindrome.isPalindrome("Madam"));
		MultiplicationTable.printMultiplicationTable();
		Factorial.printFactorialValue();
		//DayOfWeek.printDayOfWeek("2019-10-17");
	}

}
