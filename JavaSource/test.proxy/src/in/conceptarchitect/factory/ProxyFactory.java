package in.conceptarchitect.factory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;

import in.conceptarchitect.searchengine.SearchEngine;

public class ProxyFactory {

	
	public static Object configure(String configFileName){
		
		Object object=null;
		try{
		BufferedReader reader=new BufferedReader(new FileReader(configFileName));
		
		String line;
		
		
		
		while((line=reader.readLine())!=null){
			System.out.println("configuing:"+line);
			object= buildObject(object,line);		
		
			
		}
		
		}
		catch(Exception ex){
			throw new RuntimeException("Failed to configure proxy",ex);
		}
		
		
		return object;
		
	}

	private static Object buildObject(Object currentObject, String line) throws Exception {
		// TODO Auto-generated method stub
		try{
		if(line==null || line=="")
			return currentObject;
		
		Class c=Class.forName(line);
		
		System.out.println("class is "+c);
		
		
		if(currentObject==null) //I have to create the target
			return c.newInstance();
		
		Constructor ctor= c.getConstructor(SearchEngine.class);
		
		if(ctor==null)
			return currentObject;
		
		Object o= ctor.newInstance(currentObject);
		
		return o;
		}
		catch(Exception ex){
			ex.printStackTrace(System.out);
			return currentObject;
		}
		
	}
}



