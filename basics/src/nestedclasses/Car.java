package nestedclasses;

public class Car {
	private  String model;
	private int id;
	
	
	public Car(String model, int id) {
		super();
		this.model = model;
		this.id = id;
	}
	
	// non static inner class
	
	private class Motor {
		public void startMotor() {
			System.out.println("Motor is running");
			
			}
		}
	
	
	// static inner class
	
	public static class Battery{ // baterija galima pasiekti nekuriant objekto
		public void charge() {
			System.out.println("Battery is charging");
		}
	}


	public String getModel() {
		return model;
	}


	public int getId() {
		return id;
	}
	
	public void start() {
		Motor motor = new Motor();
		motor.startMotor();
		System.out.println("wrum wrum " + this.id);
		class SomeClass { // idetine lokali klase
			public void someMethod() {
				System.out.println("Just something");
			}
		}
		SomeClass someClass = new SomeClass();
		someClass.someMethod();
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", id=" + id + "]";
	}
	
	
	
	
}
