package mahmud.srp.refactored;

public class DataStorageService {

    public void saveToDatabase(PartTimeEmployee employee){
        String statement = "INSERT INTO employee (name, hourlyRateInTaka, hourWorked) VALUES" +
                " ('"+employee.getName()+"', "+employee.getHourlyRateInTaka()+", "+employee.getHourWorked()+")";
        // save to database
    }
}
