package structural.flyweight;

public class JavaPlatform implements Platform {

	public JavaPlatform() {
		System.out.println("Created Java Platform");
	}

	@Override
	public void execute(Code code) {
		System.out.println("Execute " + code.getCode() + " On Java");
	}

}
