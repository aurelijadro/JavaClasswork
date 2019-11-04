package patterns.creational.factory.one;

public class JavaDeveloperFactory implements DeveloperFactory{

	@Override
	public Developer createDeveloper() {
		// TODO Auto-generated method stub
		return new JavaDeveloper();
	}

}
