package test.uiapp;

public class SteelUIFactory implements AbstractUIFactory {

	@Override
	public AbstractButton createButton() {
		// TODO Auto-generated method stub
		return new SteelButton();
	}

	@Override
	public AbstractForm createForm() {
		// TODO Auto-generated method stub
		return new SteelForm();
	}

	@Override
	public AbstractTextBox createTextBox() {
		// TODO Auto-generated method stub
		return new SteelTextBox();
	}

}
