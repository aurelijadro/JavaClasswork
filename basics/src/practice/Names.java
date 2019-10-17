package practice;

public class Names {
	
	public static String defineGender(String name) {
		char [] nameLetters = name.toCharArray();
		if (nameLetters[name.length()-1]=='s' || nameLetters[name.length()-1]=='S') {
			return name +" is male";
		} else {
			return name +" is female";
		}
		
	}
	
}
