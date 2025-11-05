package kaplich.t319;

import kaplich.task1.Account;
import kaplich.task1.CheckingAccount;
import kaplich.task1.SavingsAccount;
import kaplich.task2.Student;
import kaplich.task3.Employee;
import kaplich.task3.FixedSalaryEmployee;
import kaplich.task3.HourlyEmployee;
import kaplich.task3.Report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

import static kaplich.task2.Student.printStudents;
import static kaplich.task2.Student.processStudents;

public class App
{
    public static void main( String[] args )
    {



        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Каплич Виталий Викторович", "Т-319", 4, Arrays.asList(4, 5, 3, 4)));
        students.add(new Student("Сергеев Егор Михайлович", "Т-234", 4, Arrays.asList(2, 3, 2, 3)));
        students.add(new Student("Чернов Максим Эдуардович", "Т-339", 1, Arrays.asList(5, 5, 5, 5)));
        students.add(new Student("Максимова Владлена Игоревна", "П-134", 2, Arrays.asList(3, 3, 2, 3)));


        processStudents(students);

        System.out.printf("%n%nСтуденты 1 курса:%n");
        printStudents(students, 1);

        System.out.printf("%nСтуденты 2 курса:%n");
        printStudents(students, 2);

        System.out.printf("%nСтуденты 3 курса:%n");
        printStudents(students, 3);

        System.out.printf("%nСтуденты 4 курса:%n");
        printStudents(students, 4);

        Employee[] employees = {
                new FixedSalaryEmployee("Каплич Виталий Викторович", 500.0),
                new FixedSalaryEmployee("Сергеев Егор Михайлович", 7500.0),
                new HourlyEmployee("Чернов Максим Эдуардович", 500.0, 160),
                new HourlyEmployee("Максимова Владлена Игоревна", 700.0, 120)
        };

        Report.generateReport(employees);

        ArrayList<Employee> employeeList = new ArrayList<Employee>(Arrays.asList(employees));

        System.out.println("%n%nУпорядоченный список сотрудников:");
        Collections.sort(employeeList);

        for (Employee emp : employeeList) {
            System.out.printf("№%d %-20s с зарплатой %10.2f руб.%n",
                    emp.getId(), emp.getFullname(), emp.getMonthlySalary());
        }
        System.out.println();

        System.out.println("Первые 5 имен работников:");
        for (int i = 0; i < Math.min(5, employeeList.size()); i++) {
            System.out.printf("%d. %s%n", i + 1, employeeList.get(i).getFullname());
        }
        System.out.println();

        System.out.println("Последние 3 идентификатора работников:");
        int startIndex = Math.max(0, employeeList.size() - 3);
        for (int i = startIndex; i < employeeList.size(); i++) {
            System.out.printf("№%d%n", employeeList.get(i).getId());
        }
    }
}
