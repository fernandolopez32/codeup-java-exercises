package util;

public class InputTest {
    public static void main(String[] args) {
        // if it's static, I run it like: Input.getString()
//        Input.getString();
//        Input.yesNo();
//        Input.getInt(1,10);
//        Input input = new Input();
//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt(2,6));
//        System.out.println(input.getInt());
//        System.out.println(input.getDouble());
//        System.out.println(input.getDouble()+" Scan your next item");
        justinInput jus = new justinInput();

        int myNumber = jus.getInt();
        System.out.println(myNumber);
        double myDouble = jus.getDouble();
        System.out.println(myDouble);


    }// end of main
}// end of InputTest class
