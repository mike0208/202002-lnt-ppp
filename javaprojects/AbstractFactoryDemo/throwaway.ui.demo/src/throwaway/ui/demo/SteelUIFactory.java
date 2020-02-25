package throwaway.ui.demo;

public class SteelUIFactory extends AbstractUIFactory{

	@Override
	public AbstractForm createForm() {
		// TODO Auto-generated method stub
		return new SteelForm();
	}

	@Override
	protected AbstractButton createButton() {
		// TODO Auto-generated method stub
		return new SteelButton();
	}

	@Override
	protected AbstractTextBox createTextBox() {
		// TODO Auto-generated method stub
		return new SteelTextBox();
	}

}
