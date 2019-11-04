package patterns.creational.factory.one;

public class PhpDeveloperFactory implements DeveloperFactory{

	@Override
	public Developer createDeveloper() {
		// TODO Auto-generated method stub
		return new PhpDeveloper();
	}

}
