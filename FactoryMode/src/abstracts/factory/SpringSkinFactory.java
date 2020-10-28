package abstracts.factory;
/**
 * Spring皮肤工厂：具体工厂
 * @author Mkydy
 *
 */
public class SpringSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		return new SpringButton();
	}

	@Override
	public TextField createTextField() {
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		return new SpringComboBox();
	}

}
