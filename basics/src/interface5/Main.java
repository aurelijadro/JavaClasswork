package interface5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transport busDriverOne = new BusDriver();
		busDriverOne.drive();
		busDriverOne.getSpeed();
		
		Driver busDriverTwo = new BusDriver();
		busDriverTwo.setCategory("C");
		
		
		BusDriver busDriver = new BusDriver();
		busDriver.setCategory("C");
		busDriver.drive();
		busDriver.getSpeed();
		
	}

}
