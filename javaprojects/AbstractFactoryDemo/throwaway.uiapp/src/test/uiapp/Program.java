package test.uiapp;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractUIFactory ui=new SteelUIFactory();
		
		AbstractButton btn= ui.createButton();
		
		AbstractForm frm=ui.createForm();
		
		AbstractTextBox txt=ui.createTextBox();
		
		frm.add(btn);
		frm.add(txt);
		
		frm.draw();
		
		System.out.println("Normal Program Termination");
		
	}

}
