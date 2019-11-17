package input_output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertiesFile {
	public static void main(String[] args) {

//		Properties prop = new Properties();
//		prop.setProperty("name", "vtmc");
//		prop.setProperty("domain", "www.vtmc.lt");
//		prop.setProperty("email", "admin@vtmc.lt");
//
//		try (OutputStream os = new FileOutputStream("MyApp.properties")) {
//			prop.store(os, "My properties file");
//		} catch (IOException ex) {
//			System.out.println(ex);
//		}

		Properties prop2 = new Properties();
		prop2.setProperty("name", "vtmc");
		prop2.setProperty("domain", "www.vtmc.lt");
		prop2.setProperty("email", "admin@vtmc.lt");

		try (OutputStream os2 = new FileOutputStream("MyApp.xml")) {
			prop2.storeToXML(os2, "my xml file");
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}
}
