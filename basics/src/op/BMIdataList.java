package op;

import java.util.Arrays;

public class BMIdataList {
	String[][] bmiData = new String[0][0];

	public void updateBMIdataList(String name, String bmi) {

		String[][] updatedBMIdata = new String[bmiData.length + 1][2];
		for (int i = 0; i < bmiData.length; i++) {
			updatedBMIdata[i] = bmiData[i];
		}
		String[] newData = { name, bmi };
		updatedBMIdata[bmiData.length] = newData;
		this.bmiData = updatedBMIdata;
	}

	public void getAllData() {
		for (String[] userData : this.bmiData) {
			System.out.println(Arrays.toString(userData));
		}

	}

	public String getBMIByName(String name) {
		for (String[] userData : this.bmiData) {
			if (userData[0].equals(name)) {
				return Arrays.toString(userData);
			}
		}
		return ("Data for " + name + " not found.");
	}

}
