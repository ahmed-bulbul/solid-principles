package mahmud.ocp.problem;


import mahmud.ocp.PartTimeEmployee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataStorageService {

    private final String CONNECTION_URL = "jdbc:mysql://localhost:3306/ocp?serverTimezone=UTC";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";


    public void saveToDatabase(PartTimeEmployee employee) {
        String statement = "INSERT INTO part_time_employee (name, hourlyRateInTaka) VALUES (?,?)";
        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
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
