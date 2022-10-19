package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle();
        Scanner sc = new Scanner(System.in);
            String userResponse;

                System.out.println("Enter the radius of your circle");
                circle.setRadius(input.getDouble());

//                System.out.println("Would you like to make another circle?");


    }
}
