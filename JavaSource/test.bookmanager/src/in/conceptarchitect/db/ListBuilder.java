package in.conceptarchitect.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListBuilder<T> implements StatementExecutor<List<T>> {

	private String qry;
	private ResultSetExtractor<T> rsx;
	

	public ListBuilder(String qry, ResultSetExtractor<T> rsx) {
		super();
		this.qry = qry;
		this.rsx = rsx;
	}


	@Override
	public List<T> executeStatement(Statement stmt) throws SQLException {
		// TODO Auto-generated method stubs
		
		ResultSet rs=stmt.executeQuery(qry);
		
		ArrayList<T> result=new ArrayList<T>();
		
		while(rs.next()){
			
			
			T value=null;
			//get value from rs to build T
			//how to extract value from result set into a t
			
			value=rsx.extract(rs);
			
			result.add(value);
			
			
			
		}
		
		
		return result;
	}

}
