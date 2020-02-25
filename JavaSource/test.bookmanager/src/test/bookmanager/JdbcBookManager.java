package test.bookmanager;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcBookManager {

	private String userName;
	private String url;
	private String password;

	public List<Book> getAllBooks(){
	
		Connection con=null;
		ArrayList<Book> books=new ArrayList<>();
		try{
			con=DriverManager.getConnection(url,userName,password);
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from books");
			
			while(rs.next()){
				Book book=new Book();
				book.setId(rs.getString("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setDescription(rs.getString("description"));
				book.setPrice(rs.getInt("price"));
				book.setTags(rs.getString("tags"));
				
				books.add(book);
			}
			
			
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			try{ con.close();}catch(Exception ex){}
		}
		
		return books;
	}
	
	
	public List<Book> getBooksByAuthor(String author){
		
		Connection con=null;
		ArrayList<Book> books=new ArrayList<>();
		try{
			con=DriverManager.getConnection(url,userName,password);
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from books where author='"+author+"'");
			
			while(rs.next()){
				Book book=new Book();
				book.setId(rs.getString("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setDescription(rs.getString("description"));
				book.setPrice(rs.getInt("price"));
				book.setTags(rs.getString("tags"));
				
				books.add(book);
			}
			
			
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			try{ con.close();}catch(Exception ex){}
		}
		
		return books;
	}
	
	
	public Book getBookById(String id){
		
		Connection con=null;
	
		try{
			con=DriverManager.getConnection(url,userName,password);
			
			Statement stmt=con.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from books where id='"+id+"'");
			
			if(rs.next()){
				Book book=new Book();
				book.setId(rs.getString("id"));
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setDescription(rs.getString("description"));
				book.setPrice(rs.getInt("price"));
				book.setTags(rs.getString("tags"));
				
				return book;
			}
			
			
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			try{ con.close();}catch(Exception ex){}
		}
		
		return null;
	}
	
	public void addBook(Book book){
		
		Connection con=null;
		ArrayList<Book> books=new ArrayList<>();
		try{
			con=DriverManager.getConnection(url,userName,password);
			
			Statement stmt=con.createStatement();
	
			String qry=String.format("insert into books(id,title,author,description,tags,photo,price)"
										+ "values('%s','%s','%s','%s','%s','%s','%s')", 
									book.getId(),book.getTitle(),book.getAuthor(),book.getDescription(),book.getTags(),book.getTitle(),book.getPrice()
									);
			
			stmt.executeUpdate(qry);
			
			
			
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		finally{
			try{ con.close();}catch(Exception ex){}
		}
		
	}
	
	
	
}
