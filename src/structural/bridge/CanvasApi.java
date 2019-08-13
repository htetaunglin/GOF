package structural.bridge;

public class CanvasApi implements DrawAPI {

	@Override
	public void drawRectangle() {
		System.out.println("Draw Canvas Rectangle");
	}

	@Override
	public void drawCircle() {
		System.out.println("Draw Canvas Circle");
	}

}
