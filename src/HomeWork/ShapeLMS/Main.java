package HomeWork.ShapeLMS;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(4.5);
        Shape rectangle = new Rectangle(4.5, 6.7);
        Shape square = new Square(4.5);
        Shape triangle = new Triangle(2.4, 4.5, 5.6);
        System.out.println("Circle perimeter is: " + circle.getPerimeter());
        System.out.println("Rectangle perimeter is: " + rectangle.getPerimeter());
        System.out.println("Square perimeter is: " + square.getPerimeter());
        System.out.println("Triangle perimeter is: " + triangle.getPerimeter());
    }
}
