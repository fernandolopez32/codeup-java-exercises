package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected double width;

    public double getWidth() {
        return width;
    }

    abstract public void setWidth(double width);


    protected double length;

    public double getLength() {
        return length;
    }

    abstract public void setLength(double length);



    @Override
    public double getPerimeter() {
        return this.getLength()*2 + this.getWidth()*2;
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }
    public Quadrilateral(){}

    public Quadrilateral(double length, double width){
        this.setLength(length);
        this.setWidth(width);
    }

}
