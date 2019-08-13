package structural.bridge;

/*
 * builder pattern note (credit to Ko Thet Khine)
 * https://www.facebook.com/notes/thet-khine/object-oriented-design-pattern-series-part-7-bridge-design-pattern/10205613346652525/?hc_location=ufi
 */
public class Program {

	public static void main(String[] args) {
		DrawAPI api = new SVGApi();

		Shape shape = new Circle(api);
		shape.draw();

		api = new CanvasApi();
		shape = new Circle(api);
		shape.draw();

	}

}
