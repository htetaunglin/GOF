package structural.bridge;

public abstract class Shape {

	DrawAPI api;

	public Shape(DrawAPI api) {
		this.api = api;
	}

	abstract void draw();
}
