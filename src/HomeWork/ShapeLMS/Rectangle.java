package HomeWork.ShapeLMS;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle() {
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }
}
