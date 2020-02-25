package com.bnp.ui.glasstheme;

import in.conceptarchitect.ui.core.UIButton;
import in.conceptarchitect.ui.core.UIFactory;
import in.conceptarchitect.ui.core.UIForm;
import in.conceptarchitect.ui.core.UIPanel;
import in.conceptarchitect.ui.core.UITextBox;

public class GlassUIFactory extends UIFactory {

	@Override
	public UIForm createForm() {
		// TODO Auto-generated method stub
		return new GlassForm();
	}

	@Override
	public UIButton createButton() {
		// TODO Auto-generated method stub
		return new GlassButton();
	}

	@Override
	public UITextBox createTextBox() {
		// TODO Auto-generated method stub
		return new GlassTextBox();
	}

	@Override
	public UIPanel createPanel() {
		// TODO Auto-generated method stub
		return new GlassPanel();
	}

}
