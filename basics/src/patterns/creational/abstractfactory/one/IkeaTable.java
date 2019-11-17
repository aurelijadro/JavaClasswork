package patterns.creational.abstractfactory.one;

public class IkeaTable implements Table {

	@Override
	public void produce() {
		System.out.println("Ikea table built!");

	}

}
