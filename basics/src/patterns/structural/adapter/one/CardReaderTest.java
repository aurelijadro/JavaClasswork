package patterns.structural.adapter.one;

public class CardReaderTest {

	public static void main(String[] args) {
		USB usb = new CardReaderAdapter(new SDCard());
		usb.connectUSB();
	}

}
