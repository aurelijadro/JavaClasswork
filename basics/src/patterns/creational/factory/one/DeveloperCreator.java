package patterns.creational.factory.one;

public class DeveloperCreator {

	public static void main(String[] args) {
		//DeveloperFactory developerFactory = new JavaDeveloperFactory();
		DeveloperFactory developerFactory = createDeveloperByLanguage("php");
		Developer developer = developerFactory.createDeveloper();
		developer.writeCode();
		
	}

	private static DeveloperFactory createDeveloperByLanguage(String lang) {
		if (lang.equals("php")) {
			return new PhpDeveloperFactory();
		}
		if (lang.equals("java")) {
			return new JavaDeveloperFactory();
		}
		throw new RuntimeException("Lang not supported...");
	}
	
}
