package kaplich.t319;

public class App 
{
    public static void main( String[] args )
    {
        Rabbit rabbit1 = new Rabbit("Крош", 3, "белый", "Поле");
        Rabbit rabbit2 = new Rabbit("Крош");

        rabbit1.jump();
        rabbit1.sleep();
        rabbit1.feed("капусту");
        rabbit1.display();

        rabbit2.setAge(2);
        rabbit2.display();

        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 5);

        circle.display();

        Point p1 = new Point(3, 4);
        Point p2 = new Point(-1, -1.);

        System.out.printf("Точка (%d, %d) в кругу: %b%n", p1.x, p1.y, circle.contains(p1));
        System.out.printf("Точка (%d, %d) в кругу: %b%n", p2.x, p2.y, circle.contains(p2));

        circle.changeRadius(-1);
        circle.display();
        System.out.printf("Точка (%d, %d) в кругу: %b%n", p2.x, p2.y, circle.contains(p2));
    }
}
