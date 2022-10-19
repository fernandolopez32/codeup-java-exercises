package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle();



                System.out.println("Enter the radius of your circle");
                double radius = input.getDouble();


                System.out.println("Would you like to make another circle?");
                String userResponse = input.getString();
                System.out.println(userResponse);


    }
}
