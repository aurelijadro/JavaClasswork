package patterns.creational.singleton.two;

public class ApplicationLogger {
	
	// singleton visada grazina tik viena klases instance'a
	// 
	
	private static ApplicationLogger applicationLogger;
	private String loggerSummary = "My logger...\n";
	
	private ApplicationLogger() {}
	
	public static synchronized ApplicationLogger getApplicationLogger(){ //synchronized for multi-thread uses
		if(applicationLogger == null) {
			applicationLogger = new ApplicationLogger();
		}
		return applicationLogger;
		}
	
	public void addLogInfo(String info) {
		loggerSummary += info +"\n";
	}
	
	public void showAllLogs() {
		System.out.println(loggerSummary);
	}
	
}
