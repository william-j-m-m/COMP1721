
public class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return (radius * radius * Math.PI);
    }

    public double perimeter() {
        return (2 * Math.PI * radius);
    }
}
