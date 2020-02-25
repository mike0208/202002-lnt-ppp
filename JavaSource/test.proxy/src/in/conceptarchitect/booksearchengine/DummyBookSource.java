package in.conceptarchitect.booksearchengine;

import java.util.ArrayList;
import java.util.List;

public class DummyBookSource {

	
	ArrayList<Book> books=new ArrayList<>();
	
	private DummyBookSource(){
		books.add(new Book("The Count of Monte Cristo", "Alexandre Dumas", "fiction,classic,best-seller"));
		books.add(new Book("The Summons", "John Grisham", "fiction,legal,best-seller"));
		books.add(new Book("Kane and Abel", "John Grisham", "fiction,best-seller"));
		books.add(new Book("Freedom and Midnight", "Larry Collins", "history,classic,best-seller"));
	}
	
	public List<Book> getAll(){
		return books;
	}
	
	public List<Book> getByTags(String tag){
	//	System.out.println("searching for "+tag);
		tag=tag.toLowerCase();
		List<Book> result=new ArrayList<Book>();
		
		for(Book book:books){
		//	System.out.println("matching with "+book.getTags());
			if(book.getTags().toLowerCase().contains(tag))
				result.add(book);
		}
		
		return result;
	}
	
	public static final DummyBookSource instance=new DummyBookSource();
}
