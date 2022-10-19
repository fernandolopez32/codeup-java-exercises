package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble("Enter the radius of the circle:"));
        System.out.printf("Your Circle's area is %.2f and your circumfrence is %.2f",circle.getArea(),circle.getCircumference());

//            System.out.println("Would you like to make another circle?");
//            String userResponse = input.getString();
//            System.out.println(userResponse);


    }
}
