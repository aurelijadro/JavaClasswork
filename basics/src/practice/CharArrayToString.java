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

	public static String firstCharCapital(char [] chars) {
		StringBuilder newString = new StringBuilder();
		for (char ch : chars) {
			newString.append(ch);
		}
		String updatedString = newString.substring(0, 1).toUpperCase() + newString.substring(1);
		return updatedString;
	}
	
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
