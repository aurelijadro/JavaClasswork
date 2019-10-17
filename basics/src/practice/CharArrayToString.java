package practice;

public class CharArrayToString {

	public static String arrayToString(char[] chars) {
		String newString = "";
		if (chars.length == 0) {
			return newString;
		} else {
			for (char character : chars) {
				newString += character;
			}
			return newString;
		}
	}

	public static void printString(String string) {
		System.out.println(string);
	}

	public static String toUpperCase(String string) {
		return string.toUpperCase();

	}

	public static String toLowerCase(String string) {
		return string.toLowerCase();
	}

//	public static char[] firstCharCapital(char[] chars) {
//		String string = CharArrayToString.arrayToString(chars).toLowerCase();
//
//		char firstChar = chars[0];
//		if (((int) (firstChar)) > 96 && ((int) (firstChar)) < 123) {
//			firstChar = (char) ((int) (firstChar + 32));
//		}
//
//	}
	
	public static String backwards(char[] chars) {
		String newString = "";
		if (chars.length == 0) {
			return newString;
		} else {
			for (int i = chars.length-1; i>=0; i--) {
				newString += chars[i];
			}
			return newString;
		}
	}

}
