package in.conceptarchitect.booksearchengine;


import java.util.List;

import in.conceptarchitect.searchengine.NotFoundResult;
import in.conceptarchitect.searchengine.Query;
import in.conceptarchitect.searchengine.Result;
import in.conceptarchitect.searchengine.SearchEngine;

public class BookSearchEngine implements SearchEngine{

	@Override
	public Result search(Query query) {
		// TODO Auto-generated method stub
		BookSearchQuery q=(BookSearchQuery) query;
		
		BookSearchResult result=null;
		
		List<Book> books=DummyBookSource.instance.getByTags(q.getTag());
		
		
		
		if(books.size()>0)
			return new BookSearchResult(books);
		else
			return new NotFoundResult(query);
			
		
	}

}
