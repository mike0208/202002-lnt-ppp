package in.conceptarchitect.caching;

import java.util.HashMap;

import in.conceptarchitect.searchengine.Query;
import in.conceptarchitect.searchengine.Result;
import in.conceptarchitect.searchengine.SearchEngine;

public class CachedSearchEngine implements SearchEngine {

	SearchEngine target;
	HashMap<Query, Result> cache=new HashMap<>();
	
	@Override
	public Result search(Query q) {
		// TODO Auto-generated method stub
		
		System.out.println("cached proxy invoked...");
		
		if(cache.containsKey(q))
			return cache.get(q);
		
		Result r=target.search(q);
		cache.put(q, r);
		
		return r;
	}

	public CachedSearchEngine(SearchEngine target) {
		super();
		this.target = target;
	}

}
