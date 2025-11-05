package kaplich.task3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет по зарплатам сотрудников:");
        for (Employee employee : employees) {
            System.out.printf("%-20s со зарплатой %10.2f руб.%n", employee.getFullname(), employee.getMonthlySalary());
        }
        System.out.println();
    }
}
