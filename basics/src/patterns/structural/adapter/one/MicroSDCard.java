package patterns.structural.adapter.one;

public class MicroSDCard extends AbstractMemoryCard{

	@Override //būtina rašyti dėl labiau skaitomo kodo ir šiaip 
	public void insert() {
		System.out.println("Micro SD card inserted...");
		
	}

	@Override
	public void copyDataToComputer() {
		System.out.println("Micro Data copied.");
		
	}

	
	
}
