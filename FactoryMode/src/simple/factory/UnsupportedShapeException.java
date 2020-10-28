package simple.factory;
/**
 * 自定义异常 : 不支持的几何图形
 * @author Mkydy
 *
 */
public class UnsupportedShapeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "绘制不支持该几何图形!";
	}

	
}
