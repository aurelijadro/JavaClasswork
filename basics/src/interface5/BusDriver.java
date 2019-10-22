package interface5;

public class BusDriver implements Driver, Transport {
	private People driver;
	private String category;
	private double speed;

	@Override
	public void setCategory(String category) {
		if (category != null) {
			this.category = category;
			driver = new People();
		}
	}

	public void drive() {
		if (driver != null) {
			System.out.println("Bus is in the streets!");
		} else {
			System.out.println("There's noone to drive the bus");
		}
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}
}
