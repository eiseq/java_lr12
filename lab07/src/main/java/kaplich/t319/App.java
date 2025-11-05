package kaplich.t319;

public class App 
{
    public static void main( String[] args )
    {
        Horse horse = new Horse();
        Animal a = new Horse();
        a.eat();
        Cow cow = new Cow();

        horse.eat();
        cow.eat();
    }
}
