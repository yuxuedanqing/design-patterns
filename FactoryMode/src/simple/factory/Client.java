package simple.factory;

public class Client {

	public static void main(String[] args) {
		try {
			Shape shape = ShapeFactory.getShape("aaa");
			shape.draw();
			shape.erase();
		} catch (UnsupportedShapeException e) {
			e.printStackTrace();
		}
	}
}
