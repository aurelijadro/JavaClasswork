package practice;

public class StringChanger {
	
	public static void stringToBinary(String string) {
		String result = "";
        char[] charArray = string.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(char symbol : charArray) {
            
            int charCode = symbol;
            for (int i = 0; i < 8; i++) {
                if ((charCode & 128) == 0) {
                    builder.append(0);
                } else {
                    builder.append(1);
                }
                charCode = charCode << 1;
            }
            builder.append(" ");
        }
        result = builder.toString();
        System.out.println(result + "\n");
    } 
}
