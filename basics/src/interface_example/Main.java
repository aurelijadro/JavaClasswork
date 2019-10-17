package interface_example;

public class Main { // for testing

	public static void main(String[] args) {
		Client client = new Client(); // read, write messages, checkSocialNetrwork (select where to send)
		AndroidApplication app = new AndroidApplication();
		Facebook fb = new Facebook();
		
		client.writeMessage("Hello", "Instagram");
		

	}

}
