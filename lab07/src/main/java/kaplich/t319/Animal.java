package kaplich.t319;

abstract class Animal {
    public abstract void eat();
    public String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
}
