package rnd.dao.jdbc.rsmdp;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public interface ResultSetMetaDataProcessor {

	Object processResultSetMetaData(ResultSetMetaData rsmd) throws SQLException;

}
