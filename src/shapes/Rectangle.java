package shapes;

public class Rectangle{
    private double length;
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }



    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double gertPerimeter(){
        return this.getLength() *2 + this.getWidth() *2;
    }

    public double getArea(){
        return this.getWidth() * this.getLength();
    }

    public Rectangle(){}

    public Rectangle(double width,double length){
        this.setWidth(width);
        this.setLength(length);
    }

}
