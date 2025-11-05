package kaplich.t319;

public class Rabbit {
    public String name;
    private int age;
    protected String color;
    String habitat;

    public Rabbit(String name, int age, String color, String habitat) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.habitat = habitat;
    }

    public Rabbit(String name) {
        this(name, 1, "серый", "поле");
    }

    public void jump() {
        System.out.printf("%s прыгает по %s%n", name, habitat);
    }

    private void eat(String food) {
        System.out.printf("%s ест %s%n", name, food);
    }

    protected void sleep() {
        System.out.printf("%s спит!%n", name);
    }

    void display() {
        System.out.printf("Имя: %s, возраст: %d, цвет: %s, обитает: %s%n", name, age, color, habitat);
    }

    public void feed(String food) {
        eat(food);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }
}

