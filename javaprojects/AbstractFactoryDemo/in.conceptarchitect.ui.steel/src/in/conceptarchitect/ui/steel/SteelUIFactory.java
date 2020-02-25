package in.conceptarchitect.ui.steel;

import in.conceptarchitect.ui.core.UIButton;
import in.conceptarchitect.ui.core.UIFactory;
import in.conceptarchitect.ui.core.UIForm;
import in.conceptarchitect.ui.core.UIPanel;
import in.conceptarchitect.ui.core.UITextBox;

public class SteelUIFactory extends UIFactory {

	@Override
	public UIForm createForm() {
		// TODO Auto-generated method stub
		return new SteelForm();
	}

	@Override
	public UIButton createButton() {
		// TODO Auto-generated method stub
		return new SteelButton();
	}

	@Override
	public UITextBox createTextBox() {
		// TODO Auto-generated method stub
		return new SteelTextBox();
	}

	@Override
	public UIPanel createPanel() {
		// TODO Auto-generated method stub
		return new SteelPanel();
	}

}
