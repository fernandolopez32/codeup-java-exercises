package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    protected double width;

    abstract public void setWidth(double width);

    public double getWidth() {
        return width;
    }

    protected double length;


    abstract public void setLength(double length);

    public double getLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return (length*2) + (width*2);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public Quadrilateral() {
    }

    public Quadrilateral(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
