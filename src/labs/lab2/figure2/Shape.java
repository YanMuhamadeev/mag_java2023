package labs.lab2.figure2;

public class Shape {
    private double width;
    private double length;

    public Shape(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Shape() {}

    public void getPerimeter() {
        System.out.println(2 * (width + length));
    }

    public void getArea() {
        System.out.println(width * length);
    }
}
