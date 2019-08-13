package structural.bridge;

public class Circle extends Shape {

	public Circle(DrawAPI api) {
		super(api); // call parent constructor
	}

	@Override
	void draw() {
		api.drawCircle();
	}

}
