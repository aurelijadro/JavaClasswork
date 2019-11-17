package patterns.creational.abstractfactory.one;

public class AudejasFactory implements AbstractFactory {

	
	public Table makeTable() {
		// TODO Auto-generated method stub
		return new AudejasTable();
	}

	
	public Chair makeChair() {
		// TODO Auto-generated method stub
		return new AudejasChair();
	}

}
