package patterns.creational.abstractfactory.one;

public class Client {

	public static void main(String[] args) {
		AbstractFactory myUAB = new AudejasFactory();
		myUAB.makeTable().produce();
		AbstractFactory myUAB2 = new IkeaFactory();
		myUAB2.makeChair().produce();

	}

}
