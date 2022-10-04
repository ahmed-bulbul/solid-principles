package mahmud.srp.refactored;

import java.math.BigDecimal;

public class SalaryCalculatorService {

    public BigDecimal calculatePay(PartTimeEmployee employee){
        return new BigDecimal(employee.getHourlyRateInTaka()).multiply(employee.getHourWorked());
    }
}
