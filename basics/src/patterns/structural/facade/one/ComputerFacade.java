package patterns.structural.facade.one;

public class ComputerFacade {
	private CPU cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	public ComputerFacade() {
		this.cpu = new CPU();
		this.memory = new Memory();
		this.hardDisk = new HardDisk();
	}
	
	
	public void movingData() {
		hardDisk.readData();
		memory.loadData();
		cpu.processingData();
	}
	
}
