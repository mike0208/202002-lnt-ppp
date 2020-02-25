package test.ui;



import in.conceptarchitect.ui.core.UIComponent;
import in.conceptarchitect.ui.core.UIFactory;
import in.conceptarchitect.ui.core.UIFactoryProvider;

public class UIApp {

	public static void main(String[] args) {
	
		
		
		//UIFactory f= new SteelUIFactory();
		//UIFactory f=new RubberUIFactory();
		
		UIFactory f= UIFactoryProvider.getFactory("C:\\MyWorks\\Corporate\\202002-lnt-ppp\\javaprojects\\AbstractFactoryDemo\\test.ui\\bin\\test\\ui\\ui.config");
		
		
		AppUiBuilder builder=new AppUiBuilder(f); 
		
		
		UIComponent form= builder.BuildUI();

		form.draw("");
	}

}
