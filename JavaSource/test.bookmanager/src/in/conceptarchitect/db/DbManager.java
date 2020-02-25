package in.conceptarchitect.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import test.bookmanager.Book;

public class DbManager {
	
	private String userName;
	private String url;
	private String password;
	
	

	public DbManager(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}



	public <T> T executeStatement(StatementExecutor<T> x) {
		
		Connection con=null;
		
		try{
			con=DriverManager.getConnection(url,userName,password);
			
			Statement stmt=con.createStatement();
	
			return x.executeStatement(stmt);
			
			
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			try{ con.close();}catch(Exception ex){}
		}
		
		return null;
	}
	
	
	public <T> List<T> query(String qry,ResultSetExtractor<T> rsx){
		
		ListBuilder<T> listBuilder=new ListBuilder<T>(qry, rsx);
		
		return executeStatement(listBuilder);
		
		
		
	}
	
	
	
	
	
	
}









