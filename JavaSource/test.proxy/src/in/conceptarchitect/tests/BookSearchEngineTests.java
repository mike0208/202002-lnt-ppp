package in.conceptarchitect.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import in.conceptarchitect.authentication.AuthenticatedSearchEngine;
import in.conceptarchitect.authentication.Context;
import in.conceptarchitect.booksearchengine.BookSearchEngine;
import in.conceptarchitect.booksearchengine.BookSearchQuery;
import in.conceptarchitect.booksearchengine.BookSearchResult;
import in.conceptarchitect.caching.CachedSearchEngine;
import in.conceptarchitect.factory.ProxyFactory;
import in.conceptarchitect.searchengine.DeniedResult;
import in.conceptarchitect.searchengine.NotFoundResult;
import in.conceptarchitect.searchengine.Query;
import in.conceptarchitect.searchengine.Result;
import in.conceptarchitect.searchengine.SearchEngine;

public class BookSearchEngineTests {

	String validTag3="fiction";
	SearchEngine engine;
	
	String proxyConfig="C:/MyWorks/MyTraining/Corporate/201704-bnp-ppp/authenticated-cached.txt";
	String plainConfig="C:/MyWorks/MyTraining/Corporate/201704-bnp-ppp/plain-engine.txt";
	
	@Before
	public void setUp(){
		//engine=new BookSearchEngine();
		
		
	}
	
	
	@Test
	public void shouldReturnResultForValidSearch() {
		
		engine=(SearchEngine) ProxyFactory.configure(plainConfig);
		
		Query q=new BookSearchQuery(validTag3);
		
		Result result=engine.search(q);
		
		Assert.assertEquals(3, result.size());
		
	}

	
	@Test
	public void shouldReturnNotFoundForInvalidTag(){
		
		engine=(SearchEngine) ProxyFactory.configure(plainConfig);
		
		Query q=new BookSearchQuery("invalid-tag");
		Result result=engine.search(q);
		
		Assert.assertTrue(result instanceof NotFoundResult);
	}
	
	
	@Test
	public void shouldReturnDeniedForFailedAuthentication(){
		
		//engine=new AuthenticatedSearchEngine(engine);
		
		engine=(SearchEngine)ProxyFactory.configure(plainConfig);
		
		//invalid credentials supplied
		Context.instance.authenticate("wrong", "values");
		
		Result result=engine.search(new BookSearchQuery(validTag3));
		
		System.out.println(result);
		Assert.assertEquals(0, result.size());
		Assert.assertTrue(result instanceof DeniedResult);
		
		
	}
	
	@Test
	public void shouldReturnValidResultToAuthenticatedUser(){
		
		engine=(SearchEngine)ProxyFactory.configure(proxyConfig);
		

		//invalid credentials supplied
		Context.instance.authenticate("Vivek", "vivek");
		
		Result result=engine.search(new BookSearchQuery(validTag3));
		System.out.println(result);
		Assert.assertTrue(result instanceof BookSearchResult);
		Assert.assertEquals(3, result.size());
		
		
		
	}
	
	
	
}
