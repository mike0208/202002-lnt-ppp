package in.conceptarchitect.ui.core;

import java.util.ArrayList;

public abstract class UIContainer extends UIComponent{

	ArrayList<UIComponent> components=new ArrayList<UIComponent>();
	public void add(UIComponent component)
	{
		components.add(component);
	}
	
	@Override
	public void draw(String context) {
		// TODO Auto-generated method stub
		super.draw(context); //draw me
		
		for(UIComponent component : components){
			component.draw(context+"\t");
		}
	}
}
