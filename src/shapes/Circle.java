package shapes;

import util.Input;

import java.util.Scanner;

public class Circle {


    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }



    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }


    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }// end of constructor

}// end of Circle class

