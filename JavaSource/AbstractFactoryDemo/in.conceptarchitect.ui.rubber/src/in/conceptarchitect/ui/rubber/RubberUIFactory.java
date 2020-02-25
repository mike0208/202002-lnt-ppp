package in.conceptarchitect.ui.rubber;

import in.conceptarchitect.ui.core.UIButton;
import in.conceptarchitect.ui.core.UIFactory;
import in.conceptarchitect.ui.core.UIForm;
import in.conceptarchitect.ui.core.UIPanel;
import in.conceptarchitect.ui.core.UITextBox;
import in.conceptarchitect.ui.defaultui.DefaultButton;
import in.conceptarchitect.ui.defaultui.DefaultForm;
import in.conceptarchitect.ui.defaultui.DefaultPanel;
import in.conceptarchitect.ui.defaultui.DefaultTextBox;

public class RubberUIFactory extends UIFactory {

	@Override
	public UIForm createForm() {
		// TODO Auto-generated method stub
		return new RubberForm();
	}

	@Override
	public UIButton createButton() {
		// TODO Auto-generated method stub
		return new RubberButton();
	}

	@Override
	public UITextBox createTextBox() {
		// TODO Auto-generated method stub
		return new RubberTextBox();
	}

	@Override
	public UIPanel createPanel() {
		// TODO Auto-generated method stub
		return new RubberPanel();
	}

}
