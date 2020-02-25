package in.conceptarchitect.searchengine;

public class NotFoundResult implements Result {

	Query query;
	
	public NotFoundResult(Query query) {
		super();
		this.query = query;
	}

	@Override
	public String toString() {
		return "NotFoundResult";
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isError() {
		// TODO Auto-generated method stub
		return true;
	}

}
