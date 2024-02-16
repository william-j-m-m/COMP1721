
public class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
        else {
            radius = r;
        }

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
