package simple.factory;
/**
 * 正方形
 * @author Mkydy
 *
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("我是正方形的绘制方法");
	}

	@Override
	public void erase() {
		System.out.println("我是正方形的擦除方法");
	}

}
