package kaplich.t319;

import kaplich.t319.domain.Belarus;
import kaplich.t319.domain.Employee;
import kaplich.t319.domain.Russia;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSalary(120_345.27);
        emp.setSsn("012-34-5678");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec # " + emp.getSsn());
        System.out.println("Employee salary: " + emp.getSalary());

        Russia russia = new Russia();
        Belarus belarus = new Belarus();

        System.out.println("Страна: " + russia.getName());
        System.out.println("Население: " + russia.getPopulation() + " миллионов\n");

        System.out.println("Страна: " + belarus.getName());
        System.out.println("Население: " + belarus.getPopulation() + " миллионов");
    }
}
