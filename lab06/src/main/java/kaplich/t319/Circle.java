package kaplich.t319;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
    }

    public void changeRadius(int delta) {
        if (radius + delta > 0)
            radius += delta;
    }

    public boolean contains(Point p) {
        double dx = p.x - center.x;
        double dy = p.y - center.y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance <= radius;
    }

    public void display() {
        System.out.printf("Центр: (%d, %d), радиус: %.2f%n", center.x, center.y, radius);
    }
}
