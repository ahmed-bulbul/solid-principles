package mahmud.srp.refactored;

public class ReportService {

    public String generateReportHours(PartTimeEmployee employee){
        StringBuilder report = new StringBuilder();
        report.append("|--------------------------------------|\n");
        report.append("|--------Hours Report------------------|\n");
        report.append("|--------------------------------------|\n");
        report.append(String.format("| Name : %17s |%n", employee.getName()));
        report.append(String.format("| Hour worked : %10s |%n", employee.getHourWorked()));
        report.append("|--------------------------------------|\n");

        return report.toString();
    }
}

