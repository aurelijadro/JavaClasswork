package practice;

public class Palindrome {
	public static String isPalindrome(String word) {
		word=word.toLowerCase();
		char [] simbols = word.toCharArray();
		for (int i =0, z =simbols.length-1; i<simbols.length; i++, z--) {
			if (simbols[i]==simbols[z]) {
				continue;
			}
			else {
				return "Word \""+word+"\" is not a palindrome.";
			}
		}
		return"Word \""+word+"\" is a palindrome!";
	}
}
