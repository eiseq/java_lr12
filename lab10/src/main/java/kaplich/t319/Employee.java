package kaplich.t319;

public abstract class Employee {
    private String name;
    private String rank;
    private double salary;

    public Employee(String name, String rank, double salary) throws OkladException {
        if (name == null || name.trim().isEmpty()) {
            throw new OkladException("Имя сотрудника не может быть пустым");
        }
        if (rank == null || rank.trim().isEmpty()) {
            throw new OkladException("Должность не может быть пустой");
        }
        if (salary < 0) {
            throw new OkladException("Невозможно создать сотрудника – указана отрицательная зарплата: " + salary);
        }
        this.name = name;
        this.rank = rank;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя сотрудника не может быть пустым");
        }
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        if (rank == null || rank.trim().isEmpty()) {
            throw new IllegalArgumentException("Должность не может быть пустой");
        }
        this.rank = rank;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательной: " + salary);
        }
        this.salary = salary;
    }

    public abstract void calculateSalary();
}
