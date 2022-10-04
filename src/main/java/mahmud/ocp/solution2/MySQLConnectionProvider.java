package mahmud.ocp.solution2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionProvider implements ConnectionProvider {

    private final String CONNECTION_URL = "jdbc:mysql://localhost:3306/ocp?serverTimezone=UTC";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    @Override
    public Connection prepareConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
    }
}

