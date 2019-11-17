package network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class JavaChatServer {
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(3333);
				Socket socket = serverSocket.accept();
				DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
				DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));) {
			String string1 = ""; // input
			String string2 = ""; // output
			System.out.println("Server Started");
			while (!string1.equals("stop")) {
				string1 = dataInputStream.readUTF();
				System.out.println("Client Message: " + string1);
				System.out.println("Write Message:");
				Scanner scanner = new Scanner(System.in);
				string2 = scanner.nextLine();
				dataOutputStream.writeUTF(string2);
				dataOutputStream.flush();
			}

		} catch (Exception ex) {
			System.out.println(ex);
		}

	}
}
