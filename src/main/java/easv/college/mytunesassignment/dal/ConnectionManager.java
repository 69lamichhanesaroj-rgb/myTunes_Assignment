package easv.college.mytunesassignment.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;

public class ConnectionManager {
    public Connection getConnection() throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setDatabaseName("MyTunesAssignmentGroup8International");
        ds.setUser("XXX");
        ds.setPassword("XXX");
        ds.setServerName("EASV-DB4");
        ds.setPortNumber(1433);
        ds.setTrustServerCertificate(true);
        return ds.getConnection();


    }
}
