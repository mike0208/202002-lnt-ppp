package in.conceptarchitect.db;

import java.sql.SQLException;
import java.sql.Statement;

public interface StatementExecutor<T> {

	T executeStatement(Statement stmt) throws SQLException;
	
}
