package students2;

public class Student1 extends Student { //is failing
	private final boolean isFailing = true;
	boolean isWorking;

	public Student1(String name, int age, boolean isFailing, boolean isWorking) {
		super(name, age, isFailing);
		this.isWorking = isWorking;
		
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

}
