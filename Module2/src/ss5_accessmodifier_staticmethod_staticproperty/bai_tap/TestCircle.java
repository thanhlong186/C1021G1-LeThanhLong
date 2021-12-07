package ss5_accessmodifier_staticmethod_staticproperty.bai_tap;

import java.util.Scanner;

public class TestCircle {
    private double radius = 1.0;
    private String color = "red";
    private double area;

    public TestCircle() {
    }

    public TestCircle(double radius, double area){
        this.area = area;
        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public double getArea() {

        return Math.pow(this.radius, 2) * Math.PI;
    }

    public static void main(String[] args) {
        TestCircle circle = new TestCircle();
        System.out.println("Radius: " +  circle.getRadius());
        System.out.println("Area: " + circle.getArea());
    }

}
