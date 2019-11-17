package network;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class JavaWebPageCopy {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://en.wikipedia.org/wiki/Java_(programming_language)");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			for (int i = 1; i <= 8; i++) {
				System.out.println(connection.getHeaderField(i) + " = " + connection.getHeaderFieldKey(i));
			}

			URLConnection urlConnection = url.openConnection();
			InputStream dataStream = urlConnection.getInputStream();

			File file = new File("index.html");
			FileOutputStream os = new FileOutputStream(file);

			int dataBox;
			while ((dataBox = dataStream.read()) != -1) {
				os.write(dataBox);
				System.out.print((char) dataBox);
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
