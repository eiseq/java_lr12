package kaplich.t319;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel) {
        this(name, surname, expirienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "A1");
    }

    public String getInfo() {
        return "Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + expirienceInYears + " лет, Уровень английского: " + englishLevel + ", Зарплата: $" + salary;
    }

    public String getInfo(boolean includeSalary) {
        if (includeSalary) {
            return getInfo();
        } else {
            return "Имя: " + name + ", Фамилия: " + surname + ", Опыт: " + expirienceInYears + " лет, Уровень английского: " + englishLevel;
        }
    }

    public String getInfo(String prefix) {
        return prefix + getInfo();
    }

    public static void show() {
        System.out.println("Мы тестировщики!");
    }
}
