package labs.lab2.figure2;

public class TestFigure2 {
    public static void main(String[] args) {
        Shape shape = new Shape(10,10);
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(10,10,10);

        shape.getPerimeter();
        circle.getArea();
        triangle.getPerimeter();
        triangle.getArea();
    }
}
