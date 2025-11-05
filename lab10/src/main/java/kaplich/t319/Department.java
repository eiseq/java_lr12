package kaplich.t319;

import java.util.ArrayList;

public class Department {
    private String name;
    private int countEmployees;
    private ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name, int countEmployees) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название отдела не может быть пустым");
        }
        if (countEmployees < 0) {
            throw new IllegalArgumentException("Количество сотрудников не может быть отрицательным: " + countEmployees);
        }
        this.name = name;
        this.countEmployees = countEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название отдела не может быть пустым");
        }
        this.name = name;
    }

    public int getCountEmployees() {
        return countEmployees;
    }

    public void setCountEmployees(int countEmployees) {
        if (countEmployees < 0) {
            throw new IllegalArgumentException("Количество сотрудников не может быть отрицательным: " + countEmployees);
        }
        this.countEmployees = countEmployees;
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Сотрудник не может быть null");
        }
        employees.add(employee);
        setCountEmployees(getCountEmployees() + 1);
    }

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}
