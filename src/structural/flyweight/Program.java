package structural.flyweight;

/*
 * Fly Weight Pattern's note (Credit to Ko Thet Khine)
 * https://www.facebook.com/notes/thet-khine/object-oriented-design-pattern-series-part-12-flyweight-design-pattern/10206074370417831/?hc_location=ufi
 */
public class Program {

	public static void main(String[] args) {

		Code javaCode = new Code("Java Program");
		Code dotNetCode = new Code(".Net Program");

		Platform dotNet = PlatformFactory.getInstance(".NET");
		dotNet.execute(dotNetCode);

		Platform java = PlatformFactory.getInstance("JAVA");
		java.execute(javaCode);

		Platform java2 = PlatformFactory.getInstance("JAVA");
		java2.execute(javaCode);

		// Hash Code are equal
		System.out.println(java.hashCode());
		System.out.println(java2.hashCode());
	}

}