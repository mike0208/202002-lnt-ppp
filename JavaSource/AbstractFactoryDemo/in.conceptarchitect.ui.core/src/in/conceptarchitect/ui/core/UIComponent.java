package in.conceptarchitect.ui.core;

public abstract class UIComponent {

	public void draw(String context){
		String name=this.getClass().getName();
		
		if(name.contains("."))
		{
			int i=name.lastIndexOf('.');
			name=name.substring(i+1);
		}
		
		System.out.println(context+name+" drawn");
	}
}
