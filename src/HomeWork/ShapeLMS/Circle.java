package HomeWork.ShapeLMS;

public class Circle extends Shape{
    private double radius;
    final double pi = 3.14;
    public Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
