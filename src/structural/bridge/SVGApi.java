package structural.bridge;

public class SVGApi implements DrawAPI {
	@Override
	public void drawCircle() {
		System.out.println("Draw SVG Circle");
	}

	@Override
	public void drawRectangle() {
		System.out.println("Draw SVG Rectangle");
	}

}
