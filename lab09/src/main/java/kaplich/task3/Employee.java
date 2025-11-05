package kaplich.task3;

public abstract class Employee implements Comparable<Employee>{
    private static int nextId = 1;

    private int id;
    private String fullname;
    protected double salary;

    public Employee(String fullname) {
        this.id = nextId++;
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public abstract double getMonthlySalary();

    @Override
    public int compareTo(Employee other) {
        int salaryCompare = Double.compare(other.getMonthlySalary(), this.getMonthlySalary());
        if (salaryCompare != 0) return salaryCompare;
        return this.fullname.compareTo(other.fullname);
    }

    @Override
    public String toString() {
        return String.format("Работник №%d %s с месячной зарплатой%.2f}", id, fullname, getMonthlySalary());
    }
}
