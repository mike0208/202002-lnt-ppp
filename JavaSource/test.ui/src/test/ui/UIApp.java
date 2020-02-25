package test.ui;



import in.conceptarchitect.ui.core.UIComponent;
import in.conceptarchitect.ui.core.UIFactory;
import in.conceptarchitect.ui.steel.SteelUIFactory;

public class UIApp {

	public static void main(String[] args) {
	
		//AppUiBuilder builder=new AppUiBuilder(f); //constructor based dependency injection
		
		
		UIFactory f=new SteelUIFactory();
		AppUiBuilder builder=new AppUiBuilder(); 
		
		builder.setFactory(f); //setter based DI
		
		
		UIComponent form= builder.BuildUI();
		form.draw("");
	}

}
