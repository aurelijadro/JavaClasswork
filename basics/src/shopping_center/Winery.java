package shopping_center;

public class Winery extends Shop {
	private int bootlesOfRedWine;

	public Winery(String title, String licenseNumber, boolean licenseValid, double storeSize, int bootlesOfRedWine) {
		super(title, licenseNumber, licenseValid, storeSize);
		this.bootlesOfRedWine = bootlesOfRedWine; 
		
	}

		
}
