package throwaway.ui.demo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		POC();

	}

	private static void POC() {
		
		System.out.println("Running the POC...");
		
		AbstractUIFactory ui=new SteelUIFactory();
		
		AbstractForm form= ui.createForm();
		
		AbstractButton btn= ui.createButton();
		
		AbstractTextBox txt=ui.createTextBox();
		
		form.add(btn);
		
		form.add(txt);
		
		form.draw();
	}

}
