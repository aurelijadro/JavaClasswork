package students;

public class FailingStudent extends Student {
	boolean isWorking;

	public FailingStudent(String name, int age, boolean isFailing, boolean isWorking) {
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
