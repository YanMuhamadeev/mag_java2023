package labs.lab2.figure;

 class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("Площадь круга: " + Math.PI * (radius * radius));
    }
}
