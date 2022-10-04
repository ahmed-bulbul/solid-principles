package mahmud.ocp.solution2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionProvider implements ConnectionProvider {

    private final String CONNECTION_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    @Override
    public Connection prepareConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
    }
}

