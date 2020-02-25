package test.ui;

import etc.FactoryCreator;
import in.conceptarchitect.ui.core.UIFactory;
import in.conceptarchitect.ui.rubber.RubberUIFactory;
import in.conceptarchitect.ui.steel.SteelUIFactory;

public class SimpleFactoryCreator implements FactoryCreator{

	
	public static final SimpleFactoryCreator Instance=new SimpleFactoryCreator();
	
	String type;
	public SimpleFactoryCreator setType(String type){
		this.type=type.toLowerCase();
		return this;
	}
	
	public UIFactory getFactory(){
		
		switch(type){
		case "steel": return new SteelUIFactory(); 
		case "rubber":return new RubberUIFactory(); 
		}
		
		return null;
	}
}
