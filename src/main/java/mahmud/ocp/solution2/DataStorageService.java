package mahmud.ocp.solution2;


import mahmud.ocp.PartTimeEmployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataStorageService {

    private final ConnectionProvider connectionProvider;

    public DataStorageService(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    public void saveToDatabase(PartTimeEmployee employee) {

        String statement = "INSERT INTO part_time_employee (name, hourlyRateInTaka) VALUES (?,?)";

        try (Connection connection = connectionProvider.prepareConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(statement)
        ) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setInt(2, employee.getHourlyRateInTaka());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
