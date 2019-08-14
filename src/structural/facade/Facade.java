package structural.facade;

public class Facade {
	CPU cpu = new CPU();
	Memory memory = new Memory();
	HardDisk hardDisk = new HardDisk();

	public void start() {
		hardDisk.readBootSector();
		memory.load();
		cpu.jump();
		cpu.execute();
	}

}
