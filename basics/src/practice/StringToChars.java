package practice;

public class StringToChars {

	public static void printCharTable(String string) {
		char[] chars = string.toCharArray();
		System.out.println("Chars: "+string);
		System.out.printf("%-19s","Char: ");
		for (char char1 : chars) {
			System.out.printf("%-8s",char1);
		}
		System.out.println();
		System.out.printf("%-19s","Char code: ");
		for (char char1 : chars) {
			System.out.printf("%-8s",(int)char1);
		}
		System.out.println();
		System.out.printf("%-19s","isDigit(): ");
		for (char char1 : chars) {
			System.out.printf("%-8s",isDigit(char1) );
		}
		System.out.println();
		System.out.printf("%-19s","isLetter(): ");
		for (char char1 : chars) {
			System.out.printf("%-8s",isLetter(char1));
		}
		System.out.println();
		System.out.printf("%-19s","isLetterOrDigit(): ");
		for (char char1 : chars) {
			System.out.printf("%-8s",isLetterOrDigit(char1));
		}
		System.out.println();
		System.out.printf("%-19s","isLowerCase(): ");
		for (char char1 : chars) {
			System.out.printf("%-8s",isLowerCase(char1));
		}
		System.out.println();
		System.out.printf("%-19s","isSpaceChar(): ");
		for (char char1 : chars) {
			System.out.printf("%-8s",isSpaceChar(char1));
		}
		System.out.println();
		System.out.printf("%-19s","isUpperCase(): ");
		for (char char1 : chars) {
			System.out.printf("%-8s",isUpperCase(char1));
		}
		System.out.println();
		System.out.printf("%-19s","isWhiteSpace(): ");
		for (char char1 : chars) {
			System.out.printf("%-8s",isWhiteSpace(char1));
		}





	}

	private static boolean isDigit(char char1) {
		if (((int) (char1)) >= 48 && ((int) (char1)) <= 57) {
			return true;
		}
		return false;
	}
	
	private static boolean isLetter(char char1) {
		if (((int) (char1)) >= 65 && ((int) (char1)) <= 90) {
			return true;
		} else if (((int) (char1)) >= 97 && ((int) (char1)) <= 122) {
			return true;
		}
		return false;
	}
	
	private static boolean isLetterOrDigit(char char1) {
		if (isDigit(char1) || isLetter(char1)) {
			return true;
		}
		return false; 
	}
	
	private static boolean isLowerCase (char char1) {
		if (((int) (char1)) >= 97 && ((int) (char1)) <= 122) {
			return true;
	}
		return false;
	}
	
	private static boolean isUpperCase (char char1) {
		if (((int) (char1)) >= 65 && ((int) (char1)) <= 9) {
			return true;
	}
		return false;
	}
	
	
	private static boolean isSpaceChar (char char1) {
		if (((int) (char1)) == 32) {
			return true;
	}
		return false;
	}
	private static boolean isWhiteSpace (char char1) {
		if (Character.isWhitespace(char1)) {
			return true;
	}
		return false;
	}
		
}
