package patterns.creational.abstractfactory.one;

public class IkeaFactory implements AbstractFactory {

	
	public Table makeTable() {
		// TODO Auto-generated method stub
		return new IkeaTable();
	}

	
	public Chair makeChair() {
		// TODO Auto-generated method stub
		return new IkeaChair();
	}

}
