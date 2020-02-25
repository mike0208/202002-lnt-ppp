package in.conceptarchitect.ui.core;

public abstract class UIComponent {

	public void draw(String context){
		String name=this.getClass().getSimpleName();
		System.out.println(context+name+" drawn");
	}
}
