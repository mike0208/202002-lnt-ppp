/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package etc;


import in.conceptarchitect.ui.core.UIFactory;
import in.conceptarchitect.ui.defaultui.DefaultUIFactory;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;

/**
 *
 * @author Training
 */
public class UIFactoryCreator implements FactoryCreator
{
     Exception error=null;
    
    
    public  Exception getError() {
		return error;
	}

    public static final UIFactoryCreator Instance=new UIFactoryCreator();


	public  void setError(RuntimeException error) {
		this.error = error;
	}

	String path;
	public  UIFactoryCreator setPath(String path){
		this.path=path;
		return this;
	}

	public  UIFactory getFactory() {

        try
        {
        	String config=path+"\\theme.config";
        	
            Properties prop=new Properties();
            prop.load(new FileInputStream(config));
            
            String jarName=prop.getProperty("jar");
            String factoryClassName=prop.getProperty("factory");
            
            jarName=path+"\\"+jarName;
            
            File f=new File(jarName);
            
            URL []urls={
                            f.toURI().toURL()
                        };

            URLClassLoader loader=new URLClassLoader(urls);

            Class clsFactory=loader.loadClass(factoryClassName);
            error=null;
            return (UIFactory) clsFactory.newInstance();
        }
        catch(Exception ex)
        {
        	error=ex;
           return DefaultUIFactory.Instance; //Default or Fail Safe Dependency
            
        }



    }




}
