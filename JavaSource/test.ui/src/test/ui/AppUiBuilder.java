package test.ui;

import in.conceptarchitect.ui.core.UIComponent;
import in.conceptarchitect.ui.core.UIFactory;
import in.conceptarchitect.ui.core.UIForm;
import in.conceptarchitect.ui.core.UIPanel;

public class AppUiBuilder {
	
	UIFactory factory;
	
	//Dependency Injecting constructor
	public AppUiBuilder(UIFactory factory) {
		super();
		this.factory = factory;
	}


	public AppUiBuilder() {
		super();
	}


	public UIFactory getFactory() {
		return factory;
	}


	public void setFactory(UIFactory factory) {
		this.factory = factory;
	}


	public  UIComponent BuildUI()
	{
		UIPanel panel1=factory.createPanel();
		
		panel1.add(factory.createButton());
		panel1.add(factory.createButton());
		panel1.add(factory.createTextBox());
		
		
		UIPanel panel2=factory.createPanel();
		panel2.add(factory.createTextBox());
		panel2.add(factory.createTextBox());
		
		UIForm form=factory.createForm();
		form.add(panel1);
		form.add(panel2);
		form.add(factory.createButton());
		
		
		return form;
	}
}
