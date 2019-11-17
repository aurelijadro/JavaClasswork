package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class JavaChatClient {
	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 3333);
				DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
				DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {
			String string1 = ""; // Input
			String string2 = ""; // Output
			System.out.println("Client Started");
			while (!string2.equals("stop")) {
				System.out.println("Write message:");
				string1 = bufferedReader.readLine();
				dataOutputStream.writeUTF(string1);
				dataOutputStream.flush();
				string2 = dataInputStream.readUTF();
				System.out.println("Server Message: " + string2);
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
