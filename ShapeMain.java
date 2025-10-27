public class ShapeMain {
    public static void main(String[] args) {
        Shape rect = new RectangleShape(4, 5);
        Shape circle = new CircleShape(3);
        Shape tri = new TriangleShape(3, 4, 5);
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        System.out.println("Triangle Area: " + tri.area());
    }
}

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class RectangleShape extends Shape {
    private final double width;
    private final double height;

    public RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}

class CircleShape extends Shape {
    private final double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class TriangleShape extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public TriangleShape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(Math.max(0.0, s * (s - a) * (s - b) * (s - c)));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}
