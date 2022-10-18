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
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }


    public Circle(){

    }
    public Circle (double radius){
        setRadius(radius);
        System.out.println(this.getCircumference());
        System.out.println(this.getArea());
        System.out.println(this.radius);
    }// end of constructor

}// end of Circle class

