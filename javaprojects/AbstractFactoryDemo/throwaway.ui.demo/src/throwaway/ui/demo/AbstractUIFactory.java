package throwaway.ui.demo;

public abstract class AbstractUIFactory {

	public abstract AbstractForm createForm();

	protected abstract AbstractButton createButton();

	protected abstract AbstractTextBox createTextBox();

}
