package in.conceptarchitect.booksearchengine;

import java.util.List;

import in.conceptarchitect.searchengine.Result;

public class BookSearchResult implements Result {

	List<Book> books;

	public BookSearchResult(List<Book> books) {
		super();
		this.books = books;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return books.size();
	}

	@Override
	public boolean isError() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
