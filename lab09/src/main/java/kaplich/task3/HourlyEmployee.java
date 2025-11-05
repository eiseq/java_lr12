package kaplich.task3;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursPerMonth;

    public HourlyEmployee(String fullname, double hourlyRate, int hoursPerMonth) {
        super(fullname);
        this.hourlyRate = hourlyRate;
        this.hoursPerMonth = hoursPerMonth;
        this.salary = hourlyRate * hoursPerMonth;
    }

    @Override
    public double getMonthlySalary() {
        return hourlyRate * hoursPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursPerMonth() {
        return hoursPerMonth;
    }
}
