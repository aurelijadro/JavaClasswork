package students2;

public class Student2 extends Student{//top students
	public Student2(String name, int age, boolean isFailing) {
		super(name, age, isFailing);
		// TODO Auto-generated constructor stub
	}

	boolean isWorking;
//	boolean final isFailing = false;

//	public Student2(String name, int age,  boolean isWorking ) {
//		this.isWorking = isWorking;
//		
//	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	
}
