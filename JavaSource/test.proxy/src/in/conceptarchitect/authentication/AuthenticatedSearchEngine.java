package in.conceptarchitect.authentication;

import in.conceptarchitect.searchengine.DeniedResult;
import in.conceptarchitect.searchengine.NotFoundResult;
import in.conceptarchitect.searchengine.Query;
import in.conceptarchitect.searchengine.Result;
import in.conceptarchitect.searchengine.SearchEngine;

public class AuthenticatedSearchEngine implements SearchEngine {
	
	SearchEngine target;
	

	@Override
	public Result search(Query q) {
		// TODO Auto-generated method stub
		if(!Context.instance.isAuthenticated())
			return new DeniedResult(q);
		else
			return target.search(q);
	}


	public SearchEngine getTarget() {
		return target;
	}


	public void setTarget(SearchEngine target) {
		this.target = target;
	}


	public AuthenticatedSearchEngine(SearchEngine target) {
		super();
		this.target = target;
	}

}
