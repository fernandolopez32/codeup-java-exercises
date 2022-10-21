package shapes;

public class Square extends Quadrilateral {
 protected double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(){}

    public Square(double userInputSide){
        this.setSide(userInputSide);
    }
}
