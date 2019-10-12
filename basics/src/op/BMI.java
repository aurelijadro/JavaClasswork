package op;

public class BMI {
	private double height;
	private double weight;

	public BMI(double height, double weight) {
		if (height > 0.0 && weight > 0.0) {
			this.height = height;
			this.weight = weight;
		} else {
			// Exception
		}

	}

	public String printBMI() {
		Double bmi = this.weight / Math.pow(this.height, 2);
		return bmi.toString();
	}
}
