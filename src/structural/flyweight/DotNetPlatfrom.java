package structural.flyweight;

public class DotNetPlatfrom implements Platform {

	public DotNetPlatfrom() {
		System.out.println("Start .Net Platform");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Execute " + code.getCode() + " on Dot Net");

	}

}
