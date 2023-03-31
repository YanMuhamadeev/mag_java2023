package labs.lab2.figure2;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println(Math.PI * (radius * radius));
    }
}
