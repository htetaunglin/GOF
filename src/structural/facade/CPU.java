package structural.facade;

public class CPU {
	public void freeze() {
		System.out.println("CPU Freeze");
	}

	public void jump() {
		System.out.println("Jump to instruction");
	}

	public void execute() {
		System.out.println("Execute");
	}
}
