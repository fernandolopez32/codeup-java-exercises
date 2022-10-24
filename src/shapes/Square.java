package shapes;

public class Square extends Quadrilateral{


    @Override
    public void setWidth(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }
    public Square(){}
    public Square (double side){
        super(side,side);
    }
}
