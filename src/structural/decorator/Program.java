package structural.decorator;

/*
 * Decorator Pattern's note is here (Credit to Ko Thet Khine)
 * https://www.facebook.com/notes/thet-khine/object-oriented-design-pattern-series-part-9-decorator-design-pattern/10205671894356181/?hc_location=ufi
 */
public class Program {

	public static void main(String[] args) {

		HTMLDecorator normalHTMLLog = new HTMLDecorator(new BasicLogger());
		System.out.println(normalHTMLLog.log("This is normal log"));

		HTMLDecorator HTMLLogWithDateTime = new HTMLDecorator(new DateTimeDecorator(new BasicLogger()));
		System.out.println(HTMLLogWithDateTime.log("This is second log"));

	}

}
