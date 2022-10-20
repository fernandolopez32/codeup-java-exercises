package shapes;

public class Square extends Rectangle {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter(){
        return super.getWidth()*4;
    }
    @Override
    public double getArea() {
        return Math.pow(super.getWidth(),2);
    }

    public Square(){}
    public Square(double side){
        this.setLength(side);
        this.setWidth(side);
    }
}
