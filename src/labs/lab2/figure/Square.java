package labs.lab2.figure;

class Square implements IFigure{
    private double length;
    private double wight;

    public Square(double length, double wight) {
        this.length = length;
        this.wight = wight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }


    @Override
    public void getArea() {
        System.out.println(length * wight);
    }
}
