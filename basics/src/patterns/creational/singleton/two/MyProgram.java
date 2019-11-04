package patterns.creational.singleton.two;

public class MyProgram {

	public static void main(String[] args) {
		
		System.out.println(ApplicationLogger.getApplicationLogger());
		System.out.println(ApplicationLogger.getApplicationLogger());
		
		ApplicationLogger.getApplicationLogger().addLogInfo("It's Monday!");
		ApplicationLogger.getApplicationLogger().showAllLogs();
		
		AnotherProgram myOtherProgram = new AnotherProgram();
		myOtherProgram.run();
		
		ApplicationLogger.getApplicationLogger().showAllLogs();

	}

}
