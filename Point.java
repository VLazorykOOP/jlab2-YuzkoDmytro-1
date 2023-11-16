import java.lang.Math;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanceToPoint(Point otherPoint) {
        double dx = x - otherPoint.getX();
        double dy = y - otherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean equals(Point otherPoint) {
        return x == otherPoint.getX() && y == otherPoint.getY();
    }

    public boolean notEquals(Point otherPoint) {
        return !equals(otherPoint);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(1, 2);

        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);

        point1.move(2, 2);
        System.out.println("Точка 1 після переміщення: " + point1);

        System.out.println("Відстань від точки 1 до початку координат: " + point1.distanceToOrigin());
        System.out.println("Відстань між точкою 1 і точкою 2: " + point1.distanceToPoint(point2));

        System.out.println("Точки 1 і 2 співпадають? " + point1.equals(point2));
    }
}
