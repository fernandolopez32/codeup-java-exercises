package util;

public class InputTest {
    public static void main(String[] args) {
        // if it's static, I run it like: Input.getString()
//        Input.getString();
//        Input.yesNo();
//        Input.getInt(1,10);
        Input input = new Input();
//        System.out.println(input.getString());
        System.out.println(input.yesNo());
//        System.out.println(input.getInt(2,6));
//        System.out.println(input.getInt(2, 29));
//        System.out.println(input.getInt());

    }// end of main
}// end of InputTest class
