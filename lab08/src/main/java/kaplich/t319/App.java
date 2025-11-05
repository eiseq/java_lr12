package kaplich.t319;

public class App 
{
    public static void main( String[] args )
    {
        Animal horse = new Horse();
        Animal cow = new Cow();

        horse.eat();
        cow.eat();
    }
}
