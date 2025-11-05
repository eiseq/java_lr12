package kaplich.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new ArrayList<>(grades);
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return String.format("ФИО %s, группа %s %d курса, оценки: %s, средняя оценка %.2f",
                name, group, course, grades, getAverageGrade());
    }

    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double average = student.getAverageGrade();

            if (average < 3.0) {
                iterator.remove();
                System.out.printf("Студент со средним баллом %.2f %s был отчислен%n",
                        average, student.getName());
            } else {
                int newCourse = student.getCourse() + 1;
                student.setCourse(newCourse);
                System.out.printf("Студент со средним баллом %.2f %s был переведен на %d курс%n",
                        average, student.getName(), newCourse);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.printf("%s из группы %s со средним баллом %.2f%n",
                        student.getName(), student.getGroup(), student.getAverageGrade());
                found = true;
            }
        }
        if (!found) {
            System.out.printf("На %d курсе студентов нет%n", course);
        }
    }
}
