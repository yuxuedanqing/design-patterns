package simple.factory;
/**
 * 三角形
 * @author Mkydy
 *
 */
public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("我是三角形的绘制方法");
	}

	@Override
	public void erase() {
		System.out.println("我是三角形的擦除方法");
	}

}
