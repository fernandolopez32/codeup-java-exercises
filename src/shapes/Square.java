package shapes;

public class Square extends Quadrilateral{

    protected double side;

    public double getSide() {
        return super.length;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
      super.length = side;
    }

    @Override
    public void setLength(double length) {
        super.length = side;
    }
    public Square(){
    }
    public Square(double side){
        super(side,side);
        this.setSide(side);
    }
}
