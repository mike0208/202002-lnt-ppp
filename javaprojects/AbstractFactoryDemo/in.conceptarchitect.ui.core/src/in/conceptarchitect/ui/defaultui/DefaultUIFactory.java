package in.conceptarchitect.ui.defaultui;

import in.conceptarchitect.ui.core.UIButton;
import in.conceptarchitect.ui.core.UIFactory;
import in.conceptarchitect.ui.core.UIForm;
import in.conceptarchitect.ui.core.UIPanel;
import in.conceptarchitect.ui.core.UITextBox;

public class DefaultUIFactory extends UIFactory {

	
	
	@Override
	public UIForm createForm() {
		// TODO Auto-generated method stub
		return new DefaultForm();
	}

	@Override
	public UIButton createButton() {
		// TODO Auto-generated method stub
		return new DefaultButton();
	}

	@Override
	public UITextBox createTextBox() {
		// TODO Auto-generated method stub
		return new DefaultTextBox();
	}

	@Override
	public UIPanel createPanel() {
		// TODO Auto-generated method stub
		return new DefaultPanel();
	}

}
