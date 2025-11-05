package kaplich.t319;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, Vitaly!" );
        Tester tester1 = new Tester("Виталий", "Каплич", 5, "B2", 500.0);
        Tester tester2 = new Tester("Максим", "Чернов", 3, "B1");
        Tester tester3 = new Tester("Егор", "Сергеев");

        System.out.println(tester1.getInfo());
        System.out.println(tester2.getInfo(false));
        System.out.println(tester3.getInfo("Тестировщик: "));
        Tester.show();
    }
}
