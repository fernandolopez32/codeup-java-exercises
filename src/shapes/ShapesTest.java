package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);

        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());

        Rectangle Square = new Square(5);

        System.out.println(Square.getArea());
        System.out.println(Square.getPerimeter());


    }
}
