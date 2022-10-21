package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    @Override
    public void setWidth(double width) {

    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public double getPerimeter() {
        return super.getLength() *2 + super.getWidth()*2;
    }

    @Override
    public double getArea() {
        return super.length * super.width;
    }
    public Rectangle(){}
    public Rectangle(double l, double w){
        l = super.length;
        w = super.width;
    }
}
