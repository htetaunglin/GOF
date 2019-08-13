package structural.bridge;

public class Rectangle extends Shape {

	public Rectangle(DrawAPI api) {
		super(api);
	}

	@Override
	void draw() {
		api.drawRectangle();
	}

}
