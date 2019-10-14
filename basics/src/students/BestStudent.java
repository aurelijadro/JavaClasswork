package students;

public class BestStudent extends Student{
	boolean isWorking;

	public BestStudent(String name, int age, boolean isFailing, boolean isWorking ) {
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
