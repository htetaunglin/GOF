package creational.builder;

public class Program {
	public static void main(String[] args) {
		Text t = new Text.Builder()
				.color("RED")
				.decoration("SSS")
				.build();
		System.out.println(t);

	}
}
