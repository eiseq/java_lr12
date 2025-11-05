package kaplich.t319;

public class App 
{
    public static void main(String[] args) {
        try {
            Firm firm = new Firm("Колледж бизнеса и права");
            Department department = new Department("IT", 4);

            StateEmployee emp1 = new StateEmployee("Каплич Виталий Викторович", "Разработчик", 1000, 200);
            department.addEmployee(emp1);

            ContractEmployee cemp1 = new ContractEmployee("Чернов Максим Эдуардович", "Разработчик", 1500);
            department.addEmployee(cemp1);

            StateEmployee emp2 = new StateEmployee("Сергеев Егор Семёнович", "Тестировщик", -1000, 5000);
            department.addEmployee(emp2);

            firm.addDepartment(department);
            System.out.println("Фирма: " + firm.getName());
            for (Department dept : firm.getDepartments()) {
                System.out.println("Отдел: " + dept.getName());
                for (Employee emp : dept.getEmployees()) {
                    System.out.println("Сотрудник: " + emp.getName() + ", должность: " + emp.getRank());
                }
            }

            emp1.calculateSalary();
            cemp1.calculateSalary();
            emp2.calculateSalary();

        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка в аргументах: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Неожиданная ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}