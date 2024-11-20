package HomeWork.ShapeLMS;

public class Square extends Shape{
    private double sides;

    public Square() {
    }

    public Square(double sides) {
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    @Override
    public double getPerimeter() {
        return sides * 4;
    }
}
