package mahmud.srp.refactored;

import java.math.BigDecimal;

public class SRPRefactorExample {

    public static void main(String[] args) {
        PartTimeEmployee employee = new PartTimeEmployee("Mahmud", 100);
        employee.setHourWorked(BigDecimal.valueOf(3.5));


        SalaryCalculatorService salaryCalculatorService = new SalaryCalculatorService();
        BigDecimal pay = salaryCalculatorService.calculatePay(employee);
        System.out.println("Calculate payable amount : "+ pay);

        DataStorageService dataStorageService = new DataStorageService();
        dataStorageService.saveToDatabase(employee);

        ReportService reportService = new ReportService();
        System.out.println(reportService.generateReportHours(employee));
    }
}
