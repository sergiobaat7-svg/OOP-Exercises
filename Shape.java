abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class RectangleShape extends Shape {
    private double width;
    private double height;
    public RectangleShape(double width, double height) { this.width = width; this.height = height; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double area() { return width * height; }
    public double perimeter() { return 2 * (width + height); }
}

class CircleShape extends Shape {
    private double radius;
    public CircleShape(double radius) { this.radius = radius; }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double area() { return Math.PI * radius * radius; }
    public double perimeter() { return 2 * Math.PI * radius; }
}

class TriangleShape extends Shape {
    private double a, b, c;
    public TriangleShape(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }

    public double getA() { return a; }
    public void setA(double a) { this.a = a; }

    public double getB() { return b; }
    public void setB(double b) { this.b = b; }

    public double getC() { return c; }
    public void setC(double c) { this.c = c; }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double perimeter() { return a + b + c; }
}
