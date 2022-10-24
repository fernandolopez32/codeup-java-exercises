package shapes;

import java.sql.SQLOutput;

public class ShapesTest {
    public static void main(String[] args) {

//    Quadrilateral square = new Square(4);
//        System.out.println(square.getPerimeter());
//        System.out.println(square.getArea());

//        Quadrilateral sq = new Square();
//        sq.setLength(5);
//        System.out.println(sq.getArea());

//        Quadrilateral rect = new Rectangle(3,5);
//        System.out.println(rect.getArea());

//        Quadrilateral myShape = new Square(5);
//        System.out.println(myShape.getLength());

        Rectangle rect = new Rectangle();
        rect.setWidth(5);
        rect.setLength(4);
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getArea());

        Quadrilateral sqr = new Square();
        sqr.setLength(5);
        System.out.println(sqr.getPerimeter());
        System.out.println(sqr.getArea());

        Measurable myShape;

        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());



    }
}
