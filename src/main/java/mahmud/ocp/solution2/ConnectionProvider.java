package mahmud.ocp.solution2;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionProvider {

    Connection prepareConnection() throws SQLException;
}
