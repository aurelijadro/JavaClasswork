package patterns.structural.adapter.one;

public class SDCard extends AbstractMemoryCard{

	@Override
	public void insert() {
		System.out.println("SD card inserted...");
		
	}

	@Override
	public void copyDataToComputer() {
		System.out.println("Data copied.");
		
	}

}
