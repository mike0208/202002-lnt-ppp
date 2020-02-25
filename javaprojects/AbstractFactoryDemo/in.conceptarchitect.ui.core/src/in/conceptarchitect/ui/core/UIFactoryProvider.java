package in.conceptarchitect.ui.core;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;
import java.util.logging.Logger;

import in.conceptarchitect.ui.defaultui.DefaultUIFactory;

public class UIFactoryProvider {

	public static UIFactory getFactory(String config) {
		
		try {
		UIFactory factory=null;
			// STEP 1: read config file
			Properties prop= new Properties();
			prop.load(new FileReader(config));
			
			//STEP 2: find path of jar and factory from config
			String themePath= prop.getProperty("theme");
			String factoryName= prop.getProperty("factory");
			
			//STEP 3: create object of factory
			URL [] urls= {
					new File(themePath).toURI().toURL()
			};
			
			URLClassLoader loader=new URLClassLoader(urls);
			
			Class factoryClass= loader.loadClass(factoryName);
			
			factory= (UIFactory) factoryClass.newInstance();
			
			//STEP 4: return the factory
			return factory;
		} catch(Exception ex) {
			Logger.getLogger(UIFactoryProvider.class.getName()).warning("Unable to Load specified theme. switching to default");
			return new DefaultUIFactory();
			//throw new RuntimeException(ex.getMessage(),ex);
		}
		
		
	}

}
