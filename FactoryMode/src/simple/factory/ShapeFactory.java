package simple.factory;
/**
 * 几何图形工厂类
 * @author Mkydy
 *
 */
public class ShapeFactory {

	public static Shape getShape(String type) throws UnsupportedShapeException {
		Shape shape;
		if(type.equalsIgnoreCase(ShapeEnum.ROUND.getValue())) {
			shape = new Round();
		}else if(type.equalsIgnoreCase(ShapeEnum.SQUARE.getValue())) {
			shape = new Square();
		}else if(type.equalsIgnoreCase(ShapeEnum.TRIANGLE.getValue())) {
			shape = new Triangle();
		}else {
			throw new UnsupportedShapeException();
		}
		return shape;
	}
}
