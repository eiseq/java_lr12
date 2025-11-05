package kaplich.task3;

public class FixedSalaryEmployee  extends Employee {
    public FixedSalaryEmployee(String fullname, double salary) {
        super(fullname);
        this.salary = salary;
    }

    @Override
    public double getMonthlySalary() {
        return salary;
    }
}
