package mahmud.ocp.solution2;

import mahmud.ocp.PartTimeEmployee;

import java.math.BigDecimal;

public class OCPRefactoredExample {

    public static void main(String[] args) {
        PartTimeEmployee employee = new PartTimeEmployee("Mahmud", 100);

        ConnectionProvider connectionProvider = new MySQLConnectionProvider();
        DataStorageService dataStorageService = new DataStorageService(connectionProvider);
        dataStorageService.saveToDatabase(employee);


        ConnectionProvider oracleConnectionProvider = new OracleConnectionProvider();
        DataStorageService oracleDataStorageService = new DataStorageService(oracleConnectionProvider);
        oracleDataStorageService.saveToDatabase(employee);



    }
}
