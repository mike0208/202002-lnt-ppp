package in.conceptarchitect.searchengine;

public class DeniedResult implements Result {

	Query query;
	
	public DeniedResult(Query query) {
		super();
		this.query = query;
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

	@Override
	public String toString() {
		return "DeniedResult";
	}
	
	

}
