package kaplich.t319;

import java.util.ArrayList;
import java.util.List;

public class Firm {
    private String name;
    private ArrayList<Department> departments = new ArrayList<>();

    public Firm(String name) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название фирмы не может быть пустым");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название фирмы не может быть пустым");
        }
        this.name = name;
    }

    public void addDepartment(Department department) {
        if (department == null) {
            throw new IllegalArgumentException("Отдел не может быть null");
        }
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return new ArrayList<>(departments);
    }
}
