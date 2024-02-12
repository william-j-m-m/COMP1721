public class CircleDemo {
    public static void main(String[] args) {
        double inp_radius = Double.parseDouble(args[0]);

        Circle circle1 = new Circle(inp_radius);

        System.out.printf("Radius = %.1f\n", circle1.getRadius());
        System.out.printf("Perimeter = %.3f\n", circle1.perimeter());
        System.out.printf("Area = %.3f\n", circle1.area());
    }
}
