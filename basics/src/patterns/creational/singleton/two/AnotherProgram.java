package patterns.creational.singleton.two;

public class AnotherProgram {

	public void run() {
		System.out.println(ApplicationLogger.getApplicationLogger());
		ApplicationLogger.getApplicationLogger().addLogInfo("Oh boy!");
	}

}
