package test.list;

import java.io.PrintWriter;

import javax.management.RuntimeErrorException;

import in.conceptarchitect.collection.Task;

public class XmlWriterTask<T> implements Task<T> {
	
	PrintWriter writer;
	String rootElement;
	String childElement;
	
	
	

	public XmlWriterTask(String fileName) {
		this(fileName,"values","value");
		
	}
	public XmlWriterTask(String fileName,String rootElement,String childElement) {
		super();
		try{
		writer=new PrintWriter(fileName);
		this.rootElement=rootElement;
		this.childElement=childElement;
		}
		catch(Exception ex){
			throw new RuntimeException(ex.getMessage(),ex);
		}
	}
	

	@Override
	public void init() {
		// TODO Auto-generated method stub
		writer.println("<"+rootElement+">");
	}

	@Override
	public void process(T item) {
		// TODO Auto-generated method stub
		writer.printf("\t<%s>%s</%s>",childElement,item,childElement);
	}

	@Override
	public Object finishAndReturn() {
		// TODO Auto-generated method stub
		writer.println("</"+rootElement+">");
		writer.close();
		return null;
	}

}
