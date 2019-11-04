package javaexceptions;

import java.io.IOException;
import java.text.ParseException;


// visi exceptionai pasiveldi is throwable

public class ExceptionsFive {

	public static void main(String[] args) { // multi catch block'as
//		try {
//			run();
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		} catch (ParseException ex) {
//			ex.printStackTrace();
//		}

		try {
			run();
		} catch (IOException | ParseException ex) { // multi catch block
			ex.printStackTrace();
		}

		try {
			run();
		} catch (Exception ex) { // multi catch block Exception - visu exceptionu tevas - prigaudo viska kas imanoma
			ex.printStackTrace();
		}

	}

	private static void run() throws IOException, ParseException {

	}

}
