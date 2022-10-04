package mahmud.ocp.problem;


import mahmud.ocp.PartTimeEmployee;

import java.math.BigDecimal;

public class OCPExample {

    public static void main(String[] args) {
        PartTimeEmployee employee = new PartTimeEmployee("Mahmud", 100);
        employee.setHourWorked(BigDecimal.valueOf(3.5));

        DataStorageService dataStorageService = new DataStorageService();
        dataStorageService.saveToDatabase(employee);
    }
}
