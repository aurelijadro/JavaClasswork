package practice;

public class BytesToString {
	public static String bytesToString(byte [] bytes) {
		String secretMessage = "";
		for (byte element : bytes) {
			secretMessage+=(char)(element);
		}
		
		return secretMessage;
		
	}
}
