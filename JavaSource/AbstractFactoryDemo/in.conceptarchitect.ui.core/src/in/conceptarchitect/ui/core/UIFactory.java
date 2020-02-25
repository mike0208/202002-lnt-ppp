package in.conceptarchitect.ui.core;

public abstract class UIFactory {
 
	public abstract UIForm createForm();
	public abstract UIButton createButton();
	public abstract UITextBox createTextBox();
	public abstract UIPanel createPanel();
}
