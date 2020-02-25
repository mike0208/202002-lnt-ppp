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



	public UIFactory getFactory() {
		return factory;
	}


	public void setFactory(UIFactory factory) {
		this.factory = factory;
	}


	public  UIComponent BuildUI()
	{
		UIPanel innerPanel1=factory.createPanel();
		
		innerPanel1.add(factory.createButton());
		innerPanel1.add(factory.createButton());
		innerPanel1.add(factory.createTextBox());
		
		
		UIPanel innerPanel2=factory.createPanel();
		innerPanel2.add(factory.createTextBox());
		innerPanel2.add(factory.createTextBox());
		
		UIPanel outerPanel=factory.createPanel();
		outerPanel.add(innerPanel1);
		outerPanel.add(innerPanel2);
		
		UIForm form=factory.createForm();
		form.add(outerPanel);		
		form.add(factory.createButton());
		
		
		return form;
	}
}
