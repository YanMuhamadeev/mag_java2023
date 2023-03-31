package labs.lab2.figure;

class Rectangle implements IFigure {
    private double length;
    private double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println("Площадь фигуры: " + length * width);
    }

    public void getPerimeter() {
        System.out.println("Периметр фигуры: " + 2 * (length + width));
    }



}
