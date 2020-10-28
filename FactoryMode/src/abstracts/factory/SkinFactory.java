package abstracts.factory;
/**
 * 界面皮肤工厂接口：抽象工厂
 * @author Mkydy
 *
 */
public interface SkinFactory {

	Button createButton();
	TextField createTextField();
	ComboBox createComboBox();
}
