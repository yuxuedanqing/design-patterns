package simple.factory;
/**
 * 圆形
 * @author Mkydy
 *
 */
public class Round implements Shape {

	@Override
	public void draw() {
		System.out.println("我是圆形的绘制方法");
	}

	@Override
	public void erase() {
		System.out.println("我是圆形的擦除方法");
	}

}
