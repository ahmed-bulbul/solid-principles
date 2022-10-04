package mahmud.ocp;

import java.math.BigDecimal;

public class PartTimeEmployee {

    private final String name;
    private final int hourlyRateInTaka;
    private BigDecimal hourWorked = BigDecimal.ZERO;

    public PartTimeEmployee(String name, int hourlyRateInTaka) {
        this.name = name;
        this.hourlyRateInTaka = hourlyRateInTaka;
    }

    public String getName() {
        return name;
    }

    public int getHourlyRateInTaka() {
        return hourlyRateInTaka;
    }

    public BigDecimal getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(BigDecimal hourWorked) {
        this.hourWorked = hourWorked;
    }
}
