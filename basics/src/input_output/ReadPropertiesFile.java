package input_output;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) {
		try (InputStream is = new FileInputStream(new File("MyApp.xml"));) {
			Properties prop = new Properties();
			prop.loadFromXML(is);
			System.out.println("name: " + prop.getProperty("name"));
			System.out.println("domain: " + prop.getProperty("domain"));
			System.out.println("email: " + prop.getProperty("email"));

		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
