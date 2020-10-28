package simple.factory;
/**
 * 几何图形类型枚举
 * @author Mkydy
 *
 */
public enum ShapeEnum {

	SQUARE("正方形","square"),TRIANGLE("三角形","triangle"),ROUND("圆形","round");

	private String text;
	private String value;

	ShapeEnum(String text, String value) {
		this.text = text;
		this.value = value;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
