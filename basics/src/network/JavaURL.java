package network;

import java.net.MalformedURLException;
import java.net.URL;

public class JavaURL {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://i.pinimg.com/originals/0e/1e/8a/0e1e8ace2d78fe052f607aae724720e7.jpg");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getAuthority());
		} catch (MalformedURLException ex) {
			System.out.println(ex);
		}
	}
}
